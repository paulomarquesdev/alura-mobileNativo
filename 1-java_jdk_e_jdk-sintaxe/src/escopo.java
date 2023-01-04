public class escopo {
    public static void main(String[] args) {
        int estoque = 2;
        Boolean temEstoque = estoque>0;
        
        // Uma variável só existe e está disponível dentro do escopo em que foi criada.

        // Condicional simples
        if (temEstoque) {
            System.out.println("Temos estoque");
        } else {
            System.out.println("Não temos estoque");
        }
    }
}
