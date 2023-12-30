//package round918_div4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotQuiteLatinSquare_2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < 3; j++) {
                String string = scanner.next();
                for (int k = 0; k < 3; k++) {
                    String character = String.valueOf(string.charAt(k));
                    map.put(character, map.getOrDefault(character, 0) + 1);
                }
            }
            if (map.get("A") == 2) {
                System.out.println("A");
            } else if (map.get("B") == 2) {
                System.out.println("B");
            } else if (map.get("C") == 2) {
                System.out.println("C");
            }

        }
    }
}
