package domain;

import java.util.UUID;

public class Hospedagem {
    private UUID id;
    private Cliente hospede;
    private Quarto quarto;
    private Funcionario funcionarioEntrada;
    private Funcionario funcionarioSaida;
    private boolean ativo;
    
    
    public Hospedagem(Cliente hospede, Quarto quarto, Funcionario funcionarioEntrada) {
        this.id = UUID.randomUUID();
        this.hospede = hospede;
        this.quarto = quarto;
        this.funcionarioEntrada = funcionarioEntrada;
        this.funcionarioSaida = null;
        this.ativo = true;
    }

    public void gerarDiaria() {
        this.hospede.conta += this.quarto.categoria.preco;
    }

    public UUID getId() {
        return this.id;
    }

    public Cliente getHospede() {
        return hospede;
    }

    public void setHospede(Cliente hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Funcionario getFuncionarioEntrada() {
        return funcionarioEntrada;
    }

    public void setFuncionarioEntrada(Funcionario funcionarioEntrada) {
        this.funcionarioEntrada = funcionarioEntrada;
    }

    public Funcionario getFuncionarioSaida() {
        return funcionarioSaida;
    }

    public void setFuncionarioSaida(Funcionario funcionarioSaida) {
        this.funcionarioSaida = funcionarioSaida;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }        
}
