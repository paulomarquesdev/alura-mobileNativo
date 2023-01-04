public class Conta {
    float saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();

    private boolean verificarSaldo(float valor) {
        boolean isValid = this.saldo >= valor;

        if (isValid) {
            return true;
        } else {
            return false;
        }
    }

    public void deposita(float valor) {
        this.saldo += valor;
    }

    public boolean saca(float valor) {
        if (verificarSaldo(valor)) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Você não possui saldo suficiente");
            return false;
        }
    }

    public boolean transferir(float valor, Conta destino) {
        if (verificarSaldo(valor)) {
            this.saca(valor);
            destino.saldo += valor;
            return true;
        } else {
            System.out.println("Você não possui saldo suficiente");
            return false;
        }
    }
}