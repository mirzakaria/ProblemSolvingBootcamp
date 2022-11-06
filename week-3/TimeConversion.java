public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("05:05:45PM"));
    }

    static String timeConversion(String s) {
//        https://www.hackerrank.com/challenges/time-conversion/problem
        String res = "";
        int hour = Integer.parseInt(s.substring(0, 2));
        if (s.contains("PM") && hour < 12){
            hour += 12;
            res = hour + s.substring(2, s.length() - 2);
        } else if (s.contains("AM") && hour == 12){
            res = "00" + s.substring(2, s.length() - 2);
        } else {
            res = s.substring(0, s.length() - 2);
        }
        return res;
    }
}
