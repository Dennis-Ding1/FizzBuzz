public class Multiples {
    public static void main(String[] args) {
        int result = 0;
        int cur = 1;
        while (cur < 1000) {
            if (cur % 3 == 0 || cur % 5 == 0) {
                result++;
            }
            cur++;
        }
        System.out.println(result);

    }
}
