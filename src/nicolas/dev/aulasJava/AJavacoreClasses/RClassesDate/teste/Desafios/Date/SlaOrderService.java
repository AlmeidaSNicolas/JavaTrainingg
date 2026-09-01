package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste.Desafios.Date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SlaOrderService {

    public static void main(String[] args) throws Exception {

        Instant orderCreathionInstante = Instant.now();
        LocalDateTime estimatedDelivery = LocalDateTime.now().plusDays(2).plusHours(4);

        Thread.sleep(2500);

        Instant orderProcessInstant = Instant.now();
        Duration d1 = Duration.between(orderCreathionInstante, orderProcessInstant);
        DateTimeFormatter formataçãodata = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("=== Sistema pedido === ");
        System.out.println("instante da criação : " + orderCreathionInstante);
        System.out.println("Data e hora estimada da entrega : " + estimatedDelivery.format(formataçãodata));
        System.out.println("Tempo total do processamento : " + d1 );

    }

}
