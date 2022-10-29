public class CountingValleysHR {
    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));

    }

     static int countingValleys(int steps, String path) {
//         https://www.hackerrank.com/challenges/counting-valleys/problem
        int res = 0;
        int count = 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U'){
                count++;
                if(count == 0) res++;
            }
            else if (path.charAt(i) == 'D') count--;
        }

        return res;
    }

}
