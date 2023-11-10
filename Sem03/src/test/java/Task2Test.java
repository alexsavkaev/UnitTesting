import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task2Test {
    private Task2 task2;
    @BeforeEach
    public void setUp(){
        task2 = new Task2();
    }
    @Test
    public void getSixFirst(){
        Assertions.assertTrue(task2.firstLast6(new int[]{6, 2, 3, 4}));
    }
    @Test
    public void getSixLast(){
        Assertions.assertTrue(task2.firstLast6(new int[]{3, 4, 5, 6}));
    }
    @Test
    public void getNoSixes(){
        Assertions.assertFalse(task2.firstLast6(new int[]{1,3,4,5}));
    }

}
