import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {
    private Task1 task1;
    @BeforeEach
    public void setUp(){
        task1 = new Task1();
    }
    @ParameterizedTest
    @ValueSource(ints = { 20 , 5 , 10})
    public void getBuzz(int num){
        assertThat(task1.fizzBuzz(num)).isEqualTo("Buzz");
    }
    @ParameterizedTest
    @ValueSource(ints = {3 , 6, 9, 33})
    public void getFizz(int num){
        assertThat(task1.fizzBuzz(num)).isEqualTo("Fizz");
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 60})
    public void getfizzBuzz(int num){
        assertThat(task1.fizzBuzz(num)).isEqualTo("FizzBuzz");
    }
    @ParameterizedTest
    @ValueSource(ints = {7, 23, 47})
    public void getNoFizzBuzz(int num){
        assertThat(task1.fizzBuzz(num)).isEqualTo(""+num);
    }
}
