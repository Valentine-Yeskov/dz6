import java.util.Arrays;
import java.util.Scanner;
public class Scann {
        public static void findSymbolOccurance(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("enter your text");
                String strin = scan.nextLine();
                char[] chars = strin.toCharArray();
                Arrays.sort(chars);
                String s = String.valueOf(chars);
                for (int i = 0; i < chars.length; ) {
                        System.out.println(chars[i] + "(" + (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1) + ")");
                        i += (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1);
                }
        }
}