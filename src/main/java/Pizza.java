public class Pizza implements Pedido{

    public String predidoPronto;

    @Override
    public void prepararPedido(String ingredientes) {
        predidoPronto = "A pizza foi feita com os seguintes ingredientes: " + ingredientes;
    }

    @Override
    public String entregarPedido() {
        return predidoPronto;
    }
}
