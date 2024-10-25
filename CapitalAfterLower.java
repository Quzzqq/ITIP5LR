
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalAfterLower {
    public static void main(String[] args) {
        String text = "testThisBigLetters";

        try{
            Pattern pattern = Pattern.compile("[a-z][A-Z]");
            Matcher matcher = pattern.matcher(text);
            while(matcher.find()){
                System.out.println("!" + matcher.group() + "!");
            }
        } catch (Exception e){
            System.out.println("Ошибка" + e.getMessage());
        }
    }
}
