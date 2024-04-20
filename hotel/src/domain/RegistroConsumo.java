package domain;

import java.util.UUID;

public class RegistroConsumo {
    private UUID id;
    private Item item;
    private Quarto quarto;
    private Cliente cliente;

    public RegistroConsumo(Item item, Quarto quarto, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.item = item;
        this.quarto = quarto;
        this.cliente = cliente;
    }

    public UUID getId() {
        return this.id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    
}
