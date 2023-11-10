import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<Task3.User> data = new ArrayList<>();

    public void addUser(Task3.User user){
        if(user.logged) data.add(user);
    }
}
