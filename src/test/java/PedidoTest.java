import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void deveRetornarPedidoPizza(){
        assertEquals("A pizza foi feita com os seguintes ingredientes: Massa fina, molho de tomate, queijo mussarela, tomate e orégano.", GarcomFacade.entregarPedido("Pizza"));
    }

    @Test
    void deveRetornarPedidoMassa(){
        assertEquals("A massa foi feita com os seguintes ingredientes: Macarrão espaguete, queijo parmesão e creme de leite.", GarcomFacade.entregarPedido("Massa"));
    }
}
