//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Conta conta =  new Conta(1000, 1000);

        try {
            conta.sacar(-100);
        }catch (IllegalAccessException e){
            System.out.println("Erro ao depositar: " + e.getMessage());
        }

        try {
            conta.sacar(500);
            System.out.println("Saque realizado com sucesso!");
        }catch (IllegalAccessException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }

        System.out.println("Saldo atual: "+conta.getSaldoAtual());
    }
}