public class Conta {
    private double saldoAtual;
    private double limite;

    public Conta(double saldoAtual, double limite) {
        this.saldoAtual = saldoAtual;
        this.limite = limite;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) throws IllegalAccessException {
        if(valor > 0){
            saldoAtual -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            throw new IllegalArgumentException("Valor de saque inválido: "+valor+". O valor deve ser positivo.");
        }
    }
}
