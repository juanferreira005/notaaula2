public class ContaCorrente extends Conta {
    private double chequeES = 1000.00;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int id_conta, String titular) {
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
        if (valor <= this.x + chequeES) {
            this.x -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void ChequeEspecial() {
        System.out.println("Cheque especial de 1000,00 disponível.");
    }

    public void detalhes() {
        System.out.println("\nDetalhes da Conta Corrente:");
        System.out.println("Titular: " + titular);
        System.out.println("ID da conta: " + id_conta);
        System.out.println("Valor da conta atual: " + x);
        System.out.println("Cheque especial disponível: " + chequeES);
    }
}