package practice;

/**
 * Created by Слава on 09.05.2016.
 */
public class LonelyNumber {
    public int find(int[] input) {

        int[] mas = new int[32];
        int temp;
        int result = -0;

        for (int i=0; i<input.length; i++) {
            temp = input[i];

            for (int j=0; j<32; j++) {
                mas[j] += temp%2;
                temp >>>= 1;
            }
        }
        for (int i=0; i<32; i++) {
            mas[i] %= 5;
            result <<= 1;
            result += mas[i];
        }
        return Integer.reverse(result);
    }
}
