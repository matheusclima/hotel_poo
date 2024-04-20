package domain;

import java.util.UUID;

public class RegistroServico {
    private UUID id;
    private Cliente cliente;
    private Servico servico;
    
    public RegistroServico(Cliente cliente, Servico servico) {
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.servico = servico;
    }

    public UUID getId() {
        return this.id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    
}
