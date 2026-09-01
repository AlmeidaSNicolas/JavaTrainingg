package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste.Desafios.Date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DeliveryServiceTest {
    public static void main(String[] args) throws Exception{

        DateTimeFormatter formatobR = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        Instant orderCreationTime = Instant.now();
        LocalDateTime operationTime = LocalDateTime.now();

        Period planFreeDelivery = Period.of(0, 1, 10);
        LocalDateTime estimatedDeliveryDate = LocalDateTime.now().plus(planFreeDelivery);


        //System.out.println(estimatedDeliveryDate.format(formatobR));
        //Teste unitario de parte do codigo acima só pra simular uma classe basica de testes

        Thread.sleep(1800);

        Instant orderDispatchInstant = Instant.now();
        Duration internProcessTime = Duration.between(orderCreationTime, orderDispatchInstant);
        System.out.println("Tempo de processamento INTERNO : " + internProcessTime.toMillis());

        LocalDate custumerRegistrationDone = LocalDate.of(2025, 5, 10);

        System.out.println(" == Logs Do Sistema ");
        System.out.println("[1 : Auditoria ] ");
        System.out.println(String.format("Instante da criação em UTC " + orderCreationTime));
        System.out.println("Estimativa da entrega : " + estimatedDeliveryDate.format(formatobR));
        System.out.println("Tempo de processamento da nota " + internProcessTime.toMillis() + "ms");

        System.out.println("[ Metricas do Cliente ] ");
        System.out.println("Dias de cadastro do Cliente : " + ChronoUnit.DAYS.between(custumerRegistrationDone, operationTime ));
        System.out.println("Meses de cadastro do Cliente : " + ChronoUnit.MONTHS.between(custumerRegistrationDone, operationTime));

        System.out.println("LOG truncado abaixo : ");
        System.out.println("Timestamp agrupado por hora: " + orderDispatchInstant.truncatedTo(ChronoUnit.HOURS));
    }
}
