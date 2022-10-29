public class DecimaltoBinary {
    public static void main(String[] args) {
        int num = 15;
        int i = 0;
        int bin[] = new int[20];
        while(num > 0){
            bin[i] = num % 2;
            num /= 2;
            i++;
        }
        for (int j = i-1; j >= 0; j--){
            System.out.print(bin[j]);
        }
    }
}
