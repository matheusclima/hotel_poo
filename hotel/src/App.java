import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import domain.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Cadastrando alguns componentes para realização de um exemplo.
        Categoria luxo = new Categoria("luxo", 150, 5, 5);
        Item coca = new Item("Coca", 55.4);
        Quarto quarto = new Quarto(1501, luxo);
        quarto.reabastecerFrigobar(coca);
        Servico massagem = new Servico("Massagem", 115);
        Funcionario func = new Funcionario("Jose", "32154648");

        //Data de entrada
        Date dataDeEntrada = new Date();

        //Data de saída (3 dias depois)
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataDeEntrada);
        calendar.add(Calendar.DATE, 3);
        Date dataDeSaida = calendar.getTime();

        // Cadastrando um cliente.
        Cliente cliente = new Cliente("Matheus", "123456", "654321");
        
        //Cliente reservando um quarto.
        Reserva reserva = cliente.reservarQuarto(quarto, dataDeEntrada, dataDeSaida);
        
        //Cliente cancelando uma reserva.
        // cliente.cancelarReserva(reserva);

        //Funcionario hospedando o cliente. Ao ocupar um quarto, é gerado um registro de hospedagem.
        Hospedagem hosp = func.hospedarCliente(cliente, quarto);
        
        // Cliente solicitando um serviço. Ao fazê-lo, é gerado um registro de serviço.
        RegistroServico registroServico = cliente.solicitarServico(massagem);

        // Cliente consumindo um item do frigobar. Ao fazê-lo, é gerado um registro de consumo. 
        // Itens no frigobar antes do consumo.
        System.out.println("Antes do consumo:");
        for(Item i: quarto.getItensDoFrigobar()) {
            System.out.println(i.getDesc());
        }
        System.err.println("Depois do consumo");
        cliente.consumirItem(coca, quarto);
        // Itens no frigobar após consumo
        for(Item i: quarto.getItensDoFrigobar()) {
            System.out.println(i.getDesc());
        }
        System.out.println("---------------");
        //Gerando uma diária.
        hosp.gerarDiaria();

        // Mostrando a conta do cliente. O valor dela deve ser de 
        // 55.4 (Consumo do item) + 115 (Serviço) + 150 (Diária) = 320,4.
        System.out.println("Conta: " + cliente.getConta());

        //Funcionário desocupando um quarto.
        func.desocuparQuarto(hosp);
    }
}
