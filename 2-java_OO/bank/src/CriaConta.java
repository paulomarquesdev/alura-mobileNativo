public class CriaConta {
    public static void main (String[] args) throws Exception {
        Cliente clientePaulo = new Cliente();
        clientePaulo.nome = "Paulo";
        clientePaulo.cpf = 00000000001;
        clientePaulo.profissao = "Desenvolvedor";

        Conta primeiraConta  = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 0001;
        primeiraConta.numero = 12345;
        primeiraConta.titular = clientePaulo;

        System.out.println(primeiraConta);
    }
}
