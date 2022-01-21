import java.util.Locale;

public class CodeupCrypt {
    public static double version = 0;

    public static String hashPassword(String password) {
        String hash = "";
        for(char character : password.toCharArray()) {
            switch (character) {
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
                    break;
            }
        }
        return hash;
    }

    public static boolean checkPassword(String password, String hash) {
        return hash.equals(hashPassword(password));
    }
}