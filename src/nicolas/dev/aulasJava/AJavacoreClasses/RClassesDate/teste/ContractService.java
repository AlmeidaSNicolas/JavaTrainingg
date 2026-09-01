package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ContractService {
    public static void main(String[] args) {

        LocalDate dataInicioContrato = LocalDate.now();
        Period planoAssinatura = Period.of(1, 6, 15);
        LocalDate expirationTIme = dataInicioContrato.plus(planoAssinatura);

        LocalDate dataConsulta = dataInicioContrato.plusMonths(8);
        Period tempoRestante = Period.between(dataConsulta, expirationTIme);

        DateTimeFormatter formatacaoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("=== LOGS de Sistema === ");
        System.out.println("Data Inicio : " + dataInicioContrato.format(formatacaoBrasil));
        System.out.println("Data expiração : " + expirationTIme.format(formatacaoBrasil));
        System.out.println("Dias restantes de contrato : " + tempoRestante.getDays());
        System.out.println("Meses restantes de contrato : " + tempoRestante.getMonths());
        System.out.println("Ano restante de contrato : " + tempoRestante.getYears());
    }
}
