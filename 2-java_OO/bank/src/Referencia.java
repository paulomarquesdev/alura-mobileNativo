public class Referencia {
    public static void main(String[] args) {
        Cliente clientePaulo = new Cliente();
        clientePaulo.nome = "Paulo";
        clientePaulo.cpf = 00000000001;
        clientePaulo.profissao = "Desenvolvedor";

        Conta newConta = new Conta();
        newConta.saldo = 200;
        newConta.agencia = 0001;
        newConta.numero = 12345;
        newConta.titular = clientePaulo;

        System.out.println("Titular da primeira conta " + newConta.titular.nome);
    }
}