import java.util.List;

public class UserAccount {
    // Strings son inmutables y pueden contener caracteres especiales
    private String alias;
    private String email;

    // Listas son más flexibles que arrays
    private List<String> tweets;
    private List<String> timeline;
    private List<UserAccount> followers;
    private List<UserAccount> following;

    public UserAccount(String alias, String email, List<String> tweets) {
        this.alias = alias;
        this.email = email;
        this.tweets = tweets;
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public void follow(UserAccount user) {
        if (this.following.contains(user)) {
            return;
        }
        following.add(user);
        user.followers.add(this);
    }

    public void tweet(String mensaje) {
        tweets.add(mensaje);
        for (UserAccount follower : followers) {
            follower.timeline.add(mensaje);
        }
    }
}
