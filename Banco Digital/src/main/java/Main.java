public class Main {

    public static void main(String[] args) {
        Cliente alan = new Cliente();
       alan.setNome("Alan Patrick");

        ContaCorrente cc = new ContaCorrente(alan);
        ContaPoupanca cp = new ContaPoupanca(alan);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}
