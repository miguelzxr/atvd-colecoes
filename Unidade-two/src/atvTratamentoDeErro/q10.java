package atvTratamentoDeErro;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formato =
                new SimpleDateFormat("dd/MM/yyyy");

        formato.setLenient(false);

        System.out.print("Digite uma data (dd/MM/yyyy): ");
        String entrada = sc.nextLine();

        try {
            Date data = formato.parse(entrada);
            System.out.println("Data válida: " +
                    formato.format(data));

        } catch (ParseException e) {
            System.out.println("Erro: formato de data inválido!");
        }

        sc.close();
    }
}
