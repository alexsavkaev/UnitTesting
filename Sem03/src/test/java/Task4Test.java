import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task4Test {
    @Test
    public void isAdded(){
        Task3.User user = new Task3.User("login", "pass");
        user.auth("login", "pass");
        UserRepository repo = new UserRepository();
        repo.addUser(user);
        assertThat(repo.data).contains(user);
    }
    @Test
    public void isNotAdded(){
        Task3.User user = new Task3.User("login", "pass");
        user.auth("logins", "pass");
        UserRepository repo = new UserRepository();
        repo.addUser(user);
        assertThat(repo.data).doesNotContain(user);
    }
}
