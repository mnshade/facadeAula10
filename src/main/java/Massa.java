public class Massa implements Pedido{
    public String predidoPronto;

    @Override
    public void prepararPedido(String ingredientes) {
        predidoPronto = "A massa foi feita com os seguintes ingredientes: " + ingredientes;
    }

    @Override
    public String entregarPedido() {
        return predidoPronto;
    }
}
