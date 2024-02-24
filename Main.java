import HeartRades.HeartRades;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n...Resgistrar...");

        System.out.print("Nome: ");             String nome = scanner.next();
        System.out.print("Sobrenome: ");        String sobreNome = scanner.next();
        System.out.print("Dia: ");              int dia = scanner.nextInt();
        System.out.print("Mês: ");              int mes = scanner.nextInt();
        System.out.print("Ano: ");              int ano = scanner.nextInt();

        HeartRades heartRades = new HeartRades(nome, sobreNome, dia, mes, ano);

        System.out.println(heartRades.toString());

    }
}
