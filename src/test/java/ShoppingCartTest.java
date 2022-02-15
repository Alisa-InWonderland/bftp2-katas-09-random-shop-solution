import org.junit.jupiter.api.Test;
import product.Animal;
import product.Fish;
import product.GourmetProduct;
import product.MagicCard;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {

    @Test
    void calculatesThePriceWithNewProducts() {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(new Fish(0.0, "blue")); // 0.1 euro
        shoppingCart.addProduct(new GourmetProduct(10, false)); // 200 euro
        shoppingCart.addProduct(new MagicCard("a blue card", "blue"));    // 5 euro
        shoppingCart.addProduct(new Animal("Araña", 8));    // 33.6 euro



        assertThat(shoppingCart.getTotalPrice(), equalTo(205.1 + 33.6));
    }
}
