 public class Conta {
    protected double x = 0;
    protected int id_conta;
    protected String titular;

    public Conta() {
    }

    public Conta(String titular, int id_conta) {
        this.titular = titular;
        this.id_conta = id_conta;
        this.x = 0;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setId_conta(int id) {
        this.id_conta = id;
    }

    public int getId_conta() {
        return id_conta;
    }

    public double getSaldo() {
        return x;
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
        if (valor > 0 && valor <= x) {
            this.x -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void detalhes() {
        System.out.println("\nBem-vindo.");
        System.out.println("Titular: " + titular);
        System.out.println("ID da conta: " + id_conta);
        System.out.println("Valor da conta atual: " + x);
    }
}{
}
