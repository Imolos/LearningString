import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice2 {
    public static void main(String[] args) {
        String trascript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                Student\\sNumber:\\s(?<studentNumber>\\d{10})\\s* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2})\\n # Grab grade
                Birthdate:\\s+(?<birthDate>(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}))\\s* # Grab birthdate
                Gender:\\s+(?<gender>\\w+)\\b\\n # Grab gender
                State\\sID:\\s+(?<stateID>\\d+)\\b #Grab StateID
                Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.* #Grab Weighted GPA
                Unweighted\\)\\s+(?<unweightGPA>[\\d\\.]+)\\b.* #Grab Unweighted GPA
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(trascript);

        if (mat.matches()){
            System.out.println(mat.group("studentNumber"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthMonth"));
            System.out.println(mat.group("birthDay"));
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("birthDate"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateID"));
            System.out.println(mat.group("weightedGPA"));
            System.out.println(mat.group("unweightGPA"));
        }
    }
}
