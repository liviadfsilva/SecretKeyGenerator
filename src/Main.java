import java.security.SecureRandom;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[32];
        random.nextBytes(bytes);

        String token = Base64.getUrlEncoder()
                             .withoutPadding()
                             .encodeToString(bytes);
        
        System.out.println(token);
    }
}
