//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        int r;

        do {
            System.out.println("Nome do Titular:");
            c.setTitular(sc.nextLine());
            System.out.println("Número da conta:");
            c.setId_conta(sc.nextInt());
            c.detalhes();

            System.out.println("Acessar conta corrente [1] ou conta poupança [2]:");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    int Cc;
                    do {
                        System.out.println("1. Depositar");
                        System.out.println("2. Sacar");
                        System.out.println("3. Usar Cheque Especial");
                        System.out.println("4. Exibir Dados da Conta");
                        System.out.println("5. Sair");
                        Cc = sc.nextInt();
                        switch (Cc) {
                            case 1:
                                System.out.println("Valor para depósito:");
                                double valorDep = sc.nextDouble();
                                cc.depositar(valorDep);
                                break;
                            case 2:
                                System.out.println("Valor para saque:");
                                double valorSaque = sc.nextDouble();
                                cc.sacar(valorSaque);
                                break;
                            case 3:
                                cc.ChequeEspecial();
                                break;
                            case 4:
                                cc.detalhes();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }System.out.println("Deseja sair? Digite [5]");
                    } while (Cc != 5);
                    break;

                case 2:
                    int Cp;
                    do {
                        System.out.println("1. Depositar");
                        System.out.println("2. Sacar");
                        System.out.println("3. Calcular Rendimento");
                        System.out.println("4. Exibir Dados da Conta");
                        System.out.println("5. Sair");
                        Cp = sc.nextInt();
                        switch (Cp) {
                            case 1:
                                System.out.println("Valor para depósito:");
                                double valorDepPoupanca = sc.nextDouble();
                                cp.depositar(valorDepPoupanca);
                                break;
                            case 2:
                                System.out.println("Valor para saque:");
                                double valorSaquePoupanca = sc.nextDouble();
                                cp.sacar(valorSaquePoupanca);
                                break;
                            case 3:
                                System.out.println("Informe a Selic:");
                                double selic = sc.nextDouble();
                                double rendimento = cp.calcularRendimento(selic);
                                System.out.println("Rendimento: " + rendimento);
                                break;
                            case 4:
                                cp.detalhes();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }System.out.println("Deseja sair? Digite [5]");
                    } while (Cp != 5);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Deseja sair? Digite [8]");
            r = sc.nextInt();
            sc.nextLine();
        } while (r != 8);
    }
}