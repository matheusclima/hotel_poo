package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
 
public class Quarto {
    private UUID id;
    private int numeroDoQuarto;
    public Categoria categoria;
    public List<Item> itensDoFrigobar;
    public List<Item> itensDoQuarto;
    private boolean reservado;
    private boolean ocupado;

    public Quarto(int numeroDoQuarto, Categoria categoria) {
        this.id = UUID.randomUUID();
        this.numeroDoQuarto = numeroDoQuarto;
        this.categoria = categoria;
        this.itensDoFrigobar = new ArrayList<Item>();
        this.itensDoQuarto = new ArrayList<Item>();
        this.reservado = false;
        this.ocupado = false;
    }

    public void reabastecerFrigobar(Item item) {
        while(this.itensDoFrigobar.size() < this.categoria.getQuantItensNoFrigobar()) {
            this.itensDoFrigobar.add(item);
        }
    }

    public void removerItem(Item item) {
        itensDoFrigobar.remove(item);
    }

    public UUID getId() {
        return this.id;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Item> getItensDoFrigobar() {
        return itensDoFrigobar;
    }

    public void setItensDoFrigobar(List<Item> itensDoFrigobar) {
        this.itensDoFrigobar = itensDoFrigobar;
    }

    public List<Item> getItensDoQuarto() {
        return itensDoQuarto;
    }

    public void setItensDoQuarto(List<Item> itensDoQuarto) {
        this.itensDoQuarto = itensDoQuarto;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    } 

    
}
