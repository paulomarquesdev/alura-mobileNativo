public class TestarBanco {
    public static void main(String[] args) {
        Cliente clientePaulo = new Cliente();
        clientePaulo.nome = "Paulo";
        clientePaulo.cpf = 00000000001;
        clientePaulo.profissao = "Desenvolvedor";

        Conta contaPaulo = new Conta();
        contaPaulo.saldo = 200;
        contaPaulo.agencia = 0001;
        contaPaulo.numero = 12345;
        contaPaulo.titular = clientePaulo;

        System.out.println(contaPaulo.titular.nome);
    }
}
