import domain.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente("Matheus", "123456", "654321");
        Item coca = new Item("Coca", 55.4);
        Servico massagem = new Servico("Massagem", 115);
        c.consumirItem(coca);
        c.solicitarServico(massagem);
        System.out.println(c.getConta());
    }
}
