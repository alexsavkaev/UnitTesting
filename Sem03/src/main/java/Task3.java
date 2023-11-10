import java.util.Objects;

public class Task3 {
    public static class User{
        public boolean logged = false;
        String login;
        String pass;
        public User(String login, String pass) {
            this.pass = pass;
            this.login = login;
        }
        public boolean auth(String login, String pass){
            logged =  (Objects.equals(this.login, login) && Objects.equals(pass, this.pass));
            return logged;
        }
    }
}
