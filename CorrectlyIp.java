
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectlyIp {
    public static void main(String[] args) {
        String text = "212.21.241.12";

        try{
            Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matcher = pattern.matcher(text);

            if (matcher.matches()){
                System.out.println("IP-Адрес корректный");
            } else{
                System.out.println("IP-Адрес не корректный");
            }

        } catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
