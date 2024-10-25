
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsFisrtCapital {
    public static void main(String[] args) {
        String text = "Block Tower Game Tiny Throne";
        char fistLetter = 'T';

        try{
            Pattern pattern = Pattern.compile("\\b" + fistLetter + "\\w+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                System.out.println(matcher.group());
            }
        } catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
