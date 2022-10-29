public class Main {
    static int x = 654;
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        {
            int x = 50;
        }
        System.out.println(x);
    }
    static void function(int a){
        System.out.println("fun1");
    }
    static int function(int b){
        System.out.println("fun2");
    }
}