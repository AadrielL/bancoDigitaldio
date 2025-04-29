import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Lista para armazenar todas as contas criadas
        List<Conta> contas = new ArrayList<>();

        // Criando cliente 1
        Cliente c1 = new Cliente();
        c1.setNome("João");
        Conta cc1 = new ContaCorrente(c1);
        cc1.depositar(300);
        contas.add(cc1);

        // Criando cliente 2
        Cliente c2 = new Cliente();
        c2.setNome("Maria");
        Conta cc2 = new ContaCorrente(c2);
        cc2.depositar(1500);
        contas.add(cc2);

        // Criando cliente 3
        Cliente c3 = new Cliente();
        c3.setNome("Carlos");
        Conta cc3 = new ContaCorrente(c3);
        cc3.depositar(700);
        contas.add(cc3);

        // Quantidade de clientes
        System.out.println("Quantidade total de clientes: " + contas.size());

        // Encontrando cliente com maior depósito
        Conta maiorDeposito = contas.get(0);
        for (Conta conta : contas) {
            if (conta.getSaldo() > maiorDeposito.getSaldo()) {
                maiorDeposito = conta;
            }
        }

        System.out.println("\nCliente com maior depósito:");
        System.out.println("Nome: " + maiorDeposito.getCliente().getNome());
        System.out.println("Valor depositado: R$" + maiorDeposito.getSaldo());
    }
}
