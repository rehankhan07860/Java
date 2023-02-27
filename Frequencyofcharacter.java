public class Frequencyofcharacter {
    public static void main(String[] args) {
        String str = "I am Rehan Khan";
        char ch = 'r';
        int frequency = 0;
        for (int i = 0; i<str.length(); i++){
            if (ch == str.charAt(i));
            ++frequency;
        }
        System.out.println(frequency);
    }
}
