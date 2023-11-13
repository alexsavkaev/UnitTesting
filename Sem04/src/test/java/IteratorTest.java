import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

public class IteratorTest {
    @Test
    void iterWillReturnHelloWorld(){
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello")
                .thenReturn("World!");
        String result = iterator.next() + " " + iterator.next();
        assertThat(result).isEqualTo("Hello World!");
    }
}
