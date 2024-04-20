package domain;

import java.util.Date;
import java.util.UUID;

public class Reserva {
    private UUID id;
    private Cliente cliente;
    private Quarto quarto;
    private Date dataDeEntrada;
    private Date dataDeSaida;
    private boolean ativo;
    
    public Reserva(Cliente cliente, Quarto quarto, Date dataDeEntrada, Date dataDeSaida) {
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataDeEntrada = dataDeEntrada;
        this.dataDeSaida = dataDeSaida;
        this.ativo = true;
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public Date getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(Date dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
