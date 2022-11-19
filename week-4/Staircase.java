public class Staircase {
    public static void main(String[] args) {
        staircase(5);
    }

    static void staircase(int n) {
//        https://www.hackerrank.com/challenges/staircase/problem
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
