package domain;

import java.util.UUID;

public class Funcionario {
    private UUID id;
    private String nome;
    private String telefone;

    public Funcionario(String nome, String telefone) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
    }

    public Hospedagem hospedarCliente(Cliente hospede, Quarto quarto) {
        Hospedagem hosp = new Hospedagem(hospede, quarto, this);
        hosp.getQuarto().setOcupado(true);
        return hosp;        
    }

    public void desocuparQuarto(Hospedagem hosp) {
        hosp.setFuncionarioSaida(this);
        hosp.setAtivo(false);
        hosp.getQuarto().setOcupado(false);
    }

    public UUID getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
