public class ViralAdvertisingHR {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }

     static int viralAdvertising(int n) {
//         https://www.hackerrank.com/challenges/counting-valleys/problem
        int shared = 5;
        int liked = 0;
        int cumul = 0;

        for (int i = 0; i < n; i++) {
            liked = shared / 2;
            cumul += liked;
            shared = liked * 3;
        }
        return cumul;
    }

}
