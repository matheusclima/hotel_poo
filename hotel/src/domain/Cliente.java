package domain;

import java.util.Date;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nome;
    private String telefone;
    private String cpf;
    private boolean hospedado;
    public double conta;

    public Cliente(String nome, String telefone, String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.hospedado = false;
        this.conta = 0;
    }

    public Reserva reservarQuarto(Quarto quarto, Date dataDeEntrada, Date dataDeSaida) {
        quarto.setReservado(true);
        Reserva reserva = new Reserva(this, quarto, dataDeEntrada, dataDeSaida);
        return reserva;
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.getQuarto().setReservado(false);
        reserva.setAtivo(false);;
        
    }

    public RegistroServico solicitarServico(Servico servico) {
        this.conta += servico.getPreco();
        RegistroServico reg = new RegistroServico(this, servico);
        return reg;
    }

    public RegistroConsumo consumirItem(Item item, Quarto quarto) {
        RegistroConsumo registroConsumo = new RegistroConsumo(item, quarto, this);
        quarto.removerItem(item);
        this.conta += item.getPreco();
        return registroConsumo;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }
    
}
