package domain;

import java.util.UUID;

public class Item {
    private UUID id = UUID.randomUUID();
    private String desc;
    private double preco;

    public Item(String desc, double preco) {
        this.desc = desc;
        this.preco = preco;
    }

    public UUID getId() {
        return this.id;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
}
