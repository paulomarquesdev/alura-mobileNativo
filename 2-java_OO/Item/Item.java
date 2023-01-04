public class Item {
    private String nome;
    private int quantidade;
    private static int totalItens;

    // Contrutor
    public Item(String nome, int quantidade) {
        totalItens++;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String valor) {
        this.nome = valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int valor) {
        this.quantidade = valor;
    }

    public static int getTotalItens() {
        return totalItens;
    }
}
