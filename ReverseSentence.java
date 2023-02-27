import static java.util.Collections.reverse;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Rehan Khan";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);
    }

    public static String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
