public class GarcomFacade {
    public static String entregarPedido(String tipoPedido){
        Ingredientes ingredientes = new Ingredientes();

        switch (tipoPedido){
            case "Pizza":
                Pedido pizza = new Pizza();
                String pizzaIngredientes = ingredientes.getPizzaIngredientes();
                pizza.prepararPedido(pizzaIngredientes);
                return pizza.entregarPedido();

            case "Massa":
                Pedido massa = new Massa();
                String massaIngredientes = ingredientes.getMassaIngredientes();
                massa.prepararPedido(massaIngredientes);
                return massa.entregarPedido();
        }
        return null;
    }
}
