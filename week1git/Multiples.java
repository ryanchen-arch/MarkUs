public class Multiples {

    public static int main_helper(int n, int a, int b) {
        int output = 0;
        for (int i = 1; i < n; i++) {
            if ((i % a == 0) || (i % b == 0)) {
                output++;
            }
        }
        return output;
    }
}
