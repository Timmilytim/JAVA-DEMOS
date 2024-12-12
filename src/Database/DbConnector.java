package Database;

public class DbConnector {
    String url;
    String username;
    String password;
    public DbConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
