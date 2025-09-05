import java.util.Scanner;

public class CalculadoraMedia {

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String verificarAprovacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirResultado(String nome, double nota1, double nota2, double nota3, double media, String status) {
        System.out.println("Aluno: "+ nome);
        System.out.println("Nota 1: "+ nota1);
        System.out.println("Nota 2: "+ nota2);
        System.out.println("Nota 3: "+ nota3);
        System.out.println("Média: "+ media);
        System.out.println("Status: "+ status);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Nome do aluno "+ i +": ");
            String nome = scan.nextLine();

            System.out.println("Primeira nota: ");
            double nota1 = scan.nextDouble();
            System.out.println("Segunda nota: ");
            double nota2 = scan.nextDouble();
            System.out.println("Terceira nota: ");
            double nota3 = scan.nextDouble();
            scan.nextLine(); 

            double media = calcularMedia(nota1, nota2, nota3);
            String status = verificarAprovacao(media);

            exibirResultado(nome, nota1, nota2, nota3, media, status);
        }

        scan.close();
    }
}
