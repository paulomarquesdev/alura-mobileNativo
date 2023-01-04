public class TesteItem {
    public static void main(String[] args) {
        Item Item1 = new Item("chocolate", 1);
        
        System.out.println(Item1.getNome());
        System.out.println(Item1.getQuantidade());
        
        Item1.setNome("Morango");
        Item1.setQuantidade(3);
        
        System.out.println(Item1.getNome());
        System.out.println(Item1.getQuantidade());
        
        Item Item2 = new Item("Arroz", 2);

        System.out.println(Item.getTotalItens());
    }
}
