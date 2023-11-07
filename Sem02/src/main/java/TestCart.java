import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCart {
    @Test
    public void testPriceCart(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);
        assertEquals(620.00d, cart.getTotalPrice());
    }
    @Test
    public void testMultiCart(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        assertEquals(510.00d, cart.getTotalPrice());
    }
    @Test
    public void testRemoveProductCart(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);
        cart.removeProductByID(1);
//        Assertions.assertEquals(450.00d, cart.getTotalPrice());
        assertThat(cart.getTotalPrice()).isEqualTo(450.00d);
    }
    @Test
    public void testSubstractFromShop(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(7);
    }
    @Test
    public void testEmptySHelve(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        for (int i = 0; i < 11; i++) {
            cart.addProductToCartByID(1);
        }
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(0);
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(10);
    }
    @Test
    public void testEmptyCart(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        for (int i = 0; i < 10; i++) {
            cart.addProductToCartByID(1);
        }
        cart.removeProductByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(1);
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(9);
    }
    @ParameterizedTest
    @ValueSource(ints = {-100, 50000, 0, -1})
    public void testException(int id){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        Assertions.assertThrows(RuntimeException.class, ()-> {
            cart.addProductToCartByID(id);
        }
        );

    }
}
