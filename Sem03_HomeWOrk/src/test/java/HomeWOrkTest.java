import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeWOrkTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 20})
    public void testEven(int n){
        assertTrue(MainHW.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 1, 5, 101})
    public void testOdd(int n){
        assertFalse(MainHW.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {26, 66, 99})
    public void isInRange(int n){
        assertTrue(MainHW.isInRange(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {25, 1000, 100})
    public void isInNotRange(int n){
        assertFalse(MainHW.isInRange(n));
    }


}
