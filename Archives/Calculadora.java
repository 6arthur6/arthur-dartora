import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("escolha a operação: (+ - * /)");
        String operacao = scan.next();

        int resultado = 0;

        if (operacao.equals("+")) { resultado = num1 + num2; } 
        if (operacao.equals("-")) { resultado = num1 - num2; } 
        if (operacao.equals("*")) { resultado = num1 * num2; } 
        if (operacao.equals("/")) { resultado = num1 / num2; }

        System.out.println("resultado: " + resultado);

        scan.close();
    }
}
