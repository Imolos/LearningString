import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String exercisesText = "Dark, bark, Lark, stark";
        String exercisesTexttoo = "Abracadabra";
        String exercisesTexttree = "Agracadagra";

        String regex = "((\\w+,\\s){3}(\\w+))";
        String regexWithoutCapture = "(?:(\\w+)\\s)"; //?: is voiding capture group

        System.out.println(exercisesText.matches(regex));
        System.out.println(exercisesTexttoo.matches("\\w(\\w{3})\\w{4}(\\w{3})"));
        System.out.println(exercisesTexttree.matches("\\w(\\w{3})\\w{4}(\\w{3})"));


    }
}
