public class Metodos {
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
        
        
        Cliente clienteAna = new Cliente();
        clienteAna.nome = "Paulo";
        clienteAna.cpf = 00000000002;
        clienteAna.profissao = "Assistente Administrativo";

        Conta contaAna = new Conta();
        contaAna.saldo = 200;
        contaAna.agencia = 0001;
        contaAna.numero = 12345;
        contaAna.titular = clienteAna;

        // contaPaulo.deposita(100);
        // boolean statusDoSaque = contaPaulo.saca(300);
        boolean statusTransaction = contaPaulo.transferir(100, contaAna); 

        System.out.println(contaPaulo.saldo);
        System.out.println(contaAna.saldo);
        System.out.println("Sucess Transaction: " + statusTransaction);
    }
}
