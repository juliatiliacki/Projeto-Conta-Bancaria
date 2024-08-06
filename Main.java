import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        String nomecliente = "Julia Tiliacki";
        String tipoConta = "Corrente";
        double saldoConta = 6500.54;
        int opcao= 0;

            System.out.println("\n---------Olá, seja bem vindo(a)---------- \n");
            System.out.println("Nome do cliente: " + nomecliente);
            System.out.println("Saldo da conta: R$" + saldoConta);
            System.out.println("Tipo da conta: " + tipoConta + "\n");

            String menu = """
                ******** M E N U ********
                Escolha uma opção:
                1. Saldo da conta
                2. Receber valor
                3. Transferir valor
                4. Sair
                *************************
                """;

        Scanner leituraDeDados = new Scanner(System.in);

                while (opcao != 4) {

                System.out.println(menu);
                opcao = leituraDeDados.nextInt();

                if(opcao == 1) {
                    System.out.println("O saldo da conta é R$" + saldoConta + "\n");

                } else if (opcao == 2) {
                    System.out.println("Digite o valor a ser depositado: R$\n");
                    double opcao2 = leituraDeDados.nextDouble();
                    saldoConta = saldoConta + opcao2;
                    System.out.println("O novo saldo da conta é de R$" + saldoConta + "\n");

                } else if (opcao == 3) {
                    System.out.println("Digite o valor a ser transferido: R$\n");
                    double opcao3 = leituraDeDados.nextDouble();
                    if (opcao3 > saldoConta) {
                        System.out.println("Você não tem saldo suficiente. Tente novamente.\n");
                    } else {
                        saldoConta = saldoConta - opcao3;
                        System.out.println("O novo saldo da conta é de R$" + saldoConta + "\n");
                    }

                } else if (opcao == 4) {
                    System.out.println("Operação encerrada.\n");

                } else {
                    System.out.println("Opção inválida. Tente novamente.\n");
                }
            }
        }
    }