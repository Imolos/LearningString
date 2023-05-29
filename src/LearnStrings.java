import javax.sound.midi.Soundbank;

public class LearnStrings {

   // Lecture 32 Comparing String to alphabetic order part 2
    /*  public static int compareToIgnoreCase(String text1,String text2) {
        String lowertext1 = text1.toLowerCase();
        String lowertext2 = text2.toLowerCase();
        return lowertext1.compareTo(lowertext2);
    }*/

    public static void main(String[] args) {

        // Lecture 37 Searching within a String - indexOf()
        String myText = "ABCDEFGABCDEFG";
        System.out.println(myText.indexOf(65)); //or "A" case sensitive
        System.out.println(myText.lastIndexOf(65)); //or "A"
        System.out.println(myText.lastIndexOf(65)); //or "A"

        // Lecture 36 Getting part of the String
        /* String myText = "apple";
        String firstPart = myText.substring(0, 1);
        String secondPart = myText.substring(1);
        String capitalFirstLetter = firstPart.toUpperCase();
        String myNewText = capitalFirstLetter.concat(secondPart);
        int capacity = capitalFirstLetter.length() + secondPart.length();
        String firstLetterCapital = new StringBuilder(capacity)
                .append(capitalFirstLetter)
                .append(secondPart)
                .toString();

        System.out.println(myText);
        System.out.println(myNewText);
        System.out.println(firstLetterCapital);*/
        // Lecture 35 Determining the Length of a String - length()
        /* Part One
        String myText = "for score and seven years ago";
        System.out.println(myText.length());
        char[] chars = myText.toCharArray();
        int index = 2;
        if (index < myText.length()) {
            System.out.println(chars[index]);
        }*
       /* Part two
       String myText = "for";
        String secondText = "score";
        StringBuilder builder = new StringBuilder(myText.length() + secondText.length())
                .append(myText)
                .append(secondText);
        System.out.println(builder.toString());*/

        //Lecture 34 String Concatenation - concat
        /* String text1 = "this is my text1";
        String text2 = "this is my text2";
        //System.out.println(text1 + " " + text2);

        System.out.println(text1.concat(text2));

        String finalString = new StringBuilder() //thread save alternativer is StringBuffer()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(finalString);

        System.out.printf("%s %s\n", text1, text2);
        String oneMoreFinalString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreFinalString);*/

        // Lecture 33 Determining if text is contained in String
        /*String myText = "Four score and seven years ago";
        System.out.println(myText.contains("seven"))*/

        // lecture 32 Comparing String to alphabetic order part 1
        /* String firstWord = "Apple";
        String secondWord = "apple";
        System.out.println(firstWord.toUpperCase().compareTo(secondWord.toUpperCase()));
        System.out.println(compareToIgnoreCase(firstWord, secondWord));*/

        //Lecture 31 Getting individual characters
        /*String myText = "Apples";
        System.out.println(myText.charAt(3));*/

        // Lecture 30 strip function
        /*String firstName = "Jake";
        System.out.printf("'%s'", firstName.strip());//Strip*/

        //29 Replacing Text within Strings
        /* String myText = "My awesome text bitch";
        System.out.println(myText.replace('e','Z'));
        System.out.println(myText.replace("bitch","friend"));*/

        //Lecture 28 Is String Blank or Empty
        /*String myText = "";
        System.out.println(myText.isEmpty());
        String myText2 = " ";
        System.out.println(myText2.isBlank());*/

        //Lecture 27 Upper & lower casing
        /*String myText = "abcdefg";
        System.out.println(myText.toUpperCase());

        String myText2 = "ABCDEFG";
        System.out.println(myText2.toLowerCase());*/

        //Lecture 26 creating strings
        /*String fruite = "apple";
        String anotherFruite = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruite == anotherFruite);
        System.out.println(vegetable == anotherVegetable);*/
    }
}
