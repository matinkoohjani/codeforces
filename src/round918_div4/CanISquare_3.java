//package round918_div4;

import java.util.Scanner;

public class CanISquare_3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            long sum = 0;
            for (int j = 0; j < t; j++) {
                sum += scanner.nextInt();
            }
            if (isSquare(sum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean isSquare(long a) {
        return Math.sqrt(a) % 1 == 0;
    }
}
