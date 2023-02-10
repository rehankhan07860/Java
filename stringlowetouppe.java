public class stringlowetouppe {
    public static void main(String[] args) {
        String str1= "rehan khan";
        String str2 = "REHAN KHAN";
        String str3 = "What are your doing REhan";
        str1 = str1.toUpperCase();
        str2 = str2.toLowerCase();
        System.out.println(str1);
        System.out.println(str2);

        str3= str3 .replace(" ", "_");
        System.out.println(str3);


    }
}
