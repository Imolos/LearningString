import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String texts = "Dark, bark, Lark, stark";

        String regex = "((\\w+,\\s){3}(\\w+))";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(texts);

        System.out.println(mat.matches());


    }
}
