import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {
    static int[] num = new int[41];
    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (num[n] == 0) {
            num[n] = fibo(n - 1) + fibo(n - 2);
        }
        return num[n];
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            if(N == 0) {
                sb.append(1).append(' ').append(fibo(N)).append('\n');
            } else {
                sb.append(fibo(N - 1)).append(' ').append(fibo(N)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
