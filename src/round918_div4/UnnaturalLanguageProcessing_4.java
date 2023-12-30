//package round918_div4;

import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class UnnaturalLanguageProcessing_4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Set<Character> v = Set.of('a', 'e');
        Set<Character> c = Set.of('b', 'c', 'd');

        for (int i = 0; i < n; i++) {
            int length = scanner.nextInt();
            String s = scanner.next();

            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < length; j++) {
                if (v.contains(s.charAt(j))) {
                    try {
                        if (c.contains(s.charAt(j + 2))) {
                            stringBuilder.append(s.charAt(j));
                            stringBuilder.append(s.charAt(j + 1));
                            stringBuilder.append('.');
                            j++;
                        } else {
                            stringBuilder.append(s.charAt(j));
                            stringBuilder.append('.');
                        }
                    }
                    catch (Exception e) {
                        stringBuilder.append(s.charAt(j));
                    }
                } else {
                    stringBuilder.append(s.charAt(j));
                }
            }

            System.out.println(stringBuilder.toString());
        }
    }
}
