public class Utils {
    public String emailEsValido(UserAccount user) {
        if (!(user.getEmail().contains("@"))) {
            return "Error: El email no es válido. Debe contener un @.";
        }
        return "El email es válido.";
    }

    public String aliasEsValido(UserAccount user) {
        if (!user.getAlias().matches("^[a-zA-Z0-9]*$")) {
            return "Error: El alias no es válido. Debe contener solo letras y números.";
        }
        return "El alias es válido.";
    }
}