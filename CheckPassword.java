
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {
    public static void main(String[] args) {
        String password = "Qwerty123";
        
        try {
            Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,16}$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()){
                System.out.println("Корректный пароль");
            } else{
                System.out.println("Не корректный пароль");
            }
        } catch (Exception e){
            System.out.println("Ошибка:" + e.getMessage());
        }
    }
}