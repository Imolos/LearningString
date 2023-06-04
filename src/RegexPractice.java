import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {
        String phoneNumber = "1 (232) 333-3265";
        String phoneNumberReg = """
            # Regex for parsing Phone number
            (?:(?<countryCode>\\d{1,3})?[-.,\\s]?)? # Get's Country Code
            (?:\\(?(?<areaCode>\\d{3})\\)?[-.,\\s]?) # Get's Area Code
            (?:(?<exchangeCode>\\d{3})[-.,\\s]?) # Get's Exchange Code
            (?<lineNumber>\\d{3,4}) # Get's Line Number
            """;

        Pattern phoneNumPat = Pattern.compile(phoneNumberReg, Pattern.COMMENTS);
        Matcher phoneNumberMat = phoneNumPat.matcher(phoneNumber);

        if (phoneNumberMat.matches()){
            System.out.format("Country code: %s\n",phoneNumberMat.group("countryCode"));
            System.out.format("Area code: %s\n",phoneNumberMat.group("areaCode"));
            System.out.format("Exchange code: %s\n",phoneNumberMat.group("exchangeCode"));
            System.out.format("Line number code: %s\n",phoneNumberMat.group("lineNumber"));
        } else {
            System.out.println("We are F*cked");
        }
    }
}
