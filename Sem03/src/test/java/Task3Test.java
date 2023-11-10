import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task3Test {
    @Test
    public void getTrue(){
        Task3.User user = new Task3.User("login", "pass");
        Assertions.assertTrue(user.auth("login", "pass"));
    }
    @Test
    public void getFalse(){
        Task3.User user = new Task3.User("login", "pass");
        Assertions.assertFalse(user.auth("login", "pass1"));

    }
}
