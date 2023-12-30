//package round918_div4;

import java.util.Scanner;

public class OddOneOut_1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a != b && a != c) {
                System.out.println(a);
            } else if (b != a) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
