public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int cur = 100;
        while (cur != 0) {
            if (cur % 2 == 0) {
                cur /= 2;
                count++;
                }
            else {
                cur--;
                count++;
            }
        }
        System.out.println(count);

    }
}
