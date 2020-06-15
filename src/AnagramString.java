import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {


        Scanner sn=new Scanner(System.in);

        System.out.println("enter first string");
        String s1 = sn.nextLine();
        System.out.println("enter second  string");
        String s2 = sn.nextLine();
        /*
         * call method from main
         * */
        System.out.println(givenStringAnagram(s1, s2));
    }

    /*
     * wriet a method given string is anagram string or not
     * */

    public static Boolean givenStringAnagram(String s1, String s2) {
        Boolean status = false;
        if (s1.length() != s2.length()) {
            return status;

        } else {
            char[] ch1 = s1.toLowerCase().toCharArray();
            char[] ch2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            status = Arrays.equals(ch1, ch2);
        }

        return status;
    }
}
