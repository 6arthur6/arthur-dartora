import java.util.Scanner;

public class caixaEletronico {

    public static void exibirMenu() {
        System.out.println("caixa eletronico");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int SENHA_CORRETA = 40028922; 
        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < 3) {
            System.out.print("Digite sua senha: ");
            int senha = scan.nextInt();

            if (senha == SENHA_CORRETA) {
                acessoPermitido = true;
                System.out.println("Acesso liberado!");
                break;
            } else {
                tentativas++;
                System.out.println("Senha incorreta! chance " + tentativas + " de 3.");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Conta bloqueada.");
            scan.close();
            return;
        }

        double saldo = 0.0;
        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scan.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado! Novo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido! O depósito deve ser maior que zero.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scan.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque realizado! Novo saldo: R$ %.2f%n", saldo);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para o saque.");
                    } else {
                        System.out.println("Valor inválido! O saque deve ser maior que zero.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por usar o caixa eletrônico. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scan.close();
    }
}
