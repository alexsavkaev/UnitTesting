import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class DiscountCalculatorTest {
    @Test
    public void discountCalculatorPositive() {
        assertThat(DiscountCalculator.calculatingDiscount(100,10))
                .isEqualTo(90);
    }
    @Test
    public void discountCalculatorNegativeDiscount(){
        assertThatThrownBy(()-> DiscountCalculator.calculatingDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class);
    }
    @Test
    public void discountCalculatorNegativePrice(){
        assertThatThrownBy(()-> DiscountCalculator.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class);
    }
}
