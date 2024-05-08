import java.util.List;

public class UserAccount {
    // Strings son inmutables y pueden contener caracteres especiales
    private String alias;
    private String email;

    // Listas son más flexibles que arrays
    private List<String> tweets;

    public UserAccount(String alias, String email, List<String> tweets) {
        this.alias = alias;
        this.email = email;
        this.tweets = tweets;
    }
}
