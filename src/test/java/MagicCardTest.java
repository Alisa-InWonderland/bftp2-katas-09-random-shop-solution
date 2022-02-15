import org.junit.jupiter.api.Test;
import product.MagicCard;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MagicCardTest {

    @Test
    void blackLotusIsVeryExpensive() {
        MagicCard magicCard = new MagicCard("Magic: The Gathering - Black Lotus", "brown");

        assertThat(magicCard.getPrice(), equalTo(40000.0));
    }

    @Test
    void cardPriceIsBasedOnColor() {
        assertThat(
                new MagicCard("Magic: The Gathering - blue card", "blue").getPrice(),
                equalTo(5.0));
        assertThat(new MagicCard("Magic: The Gathering - blue", "blue").getPrice(), equalTo(5.0));
        assertThat(new MagicCard("Magic: The Gathering - red", "red").getPrice(), equalTo(3.5));
        assertThat(new MagicCard("Magic: The Gathering - green", "green").getPrice(), equalTo(4.40));
        assertThat(new MagicCard("Magic: The Gathering - black", "black").getPrice(), equalTo(6.80));
        assertThat(new MagicCard("Magic: The Gathering - brown", "brown").getPrice(), equalTo(2.0));
    }

    @Test
    void lasCartasAzulesConMásDe10AnyosCuestanLaMitad() {
        MagicCard magicCard = new MagicCard(
                "Magic: The Gathering - blue",
                "blue",
                12);

        assertThat(magicCard.getPrice(), equalTo(2.50));
    }
}
