public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(4, 3));
    }

    static int pageCount(int n, int p) {
//        https://www.hackerrank.com/challenges/drawing-book/problem
        int frontCount, endCount;
        frontCount = p / 2;
        if(n % 2 == 0) n++;
        endCount = (n - p) / 2;
        int res = frontCount < endCount ? frontCount : endCount;

        return res;
    }
}
