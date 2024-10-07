public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int id_conta, String titular) {
        super(titular, id_conta);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.x += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.x) {
            this.x -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * this.x; // 0.5% ao mês
        } else {
            rendimento = 0.007 * selic * this.x; // 70% da Selic
        }
        return rendimento;
    }

    public void detalhes() {
        System.out.println("\nDetalhes da Conta Poupança:");
        System.out.println("Titular: " + titular);
        System.out.println("ID da conta: " + id_conta);
        System.out.println("Valor da conta atual: " + x);
    }
}
