package domain;

import java.util.UUID;

public class Categoria {
    private UUID id;
    public String desc;
    public double preco;
    private int quantItensNoQuarto;
    private int quantItensNoFrigobar;

    public Categoria(String desc, double preco, int quantItensNoQuarto, int quantItensNoFrigobar) {
        this.id = UUID.randomUUID();
        this.desc = desc;
        this.preco = preco;
        this.quantItensNoQuarto = quantItensNoQuarto;
        this.quantItensNoFrigobar = quantItensNoFrigobar;
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

    public int getQuantItensNoQuarto() {
        return quantItensNoQuarto;
    }

    public void setQuantItensNoQuarto(int quantItensNoQuarto) {
        this.quantItensNoQuarto = quantItensNoQuarto;
    }

    public int getQuantItensNoFrigobar() {
        return quantItensNoFrigobar;
    }

    public void setQuantItensNoFrigobar(int quantItensNoFrigobar) {
        this.quantItensNoFrigobar = quantItensNoFrigobar;
    }

    
}
