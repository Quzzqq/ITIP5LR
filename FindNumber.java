import java.util.regex.*;

public class FindNumber {
  public static void main(String[] args) {
    String text = "The price of the product is $19.99 or $23.20 or $111";

    try {
      Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
      Matcher matcher = pattern.matcher(text);

      while (matcher.find()) {
        System.out.println(matcher.group());
      }
    } catch (Exception e) {
      System.err.println("Ошибка при обработке текста: " + e.getMessage());
    }
  }
}