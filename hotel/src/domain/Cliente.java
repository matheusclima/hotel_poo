package domain;

import java.util.UUID;

public class Cliente {
    private UUID id = UUID.randomUUID();
    private String nome;
    private String telefone;
    private String cpf;
    private boolean hospedado;
    private double conta;

    public Cliente(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.hospedado = false;
        this.conta = 0;
    }

    public void solicitarServico(Servico servico) {
        this.conta += servico.getPreco();
    }

    public void consumirItem(Item item) {
        this.conta += item.getPreco();
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
