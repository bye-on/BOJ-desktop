import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {
    public static long[] memo = new long[101];
    public static long pado(int n) {
        if(n <= 3) {
            return 1;
        }
        if(memo[n] == 0) {
            memo[n] = pado(n - 2) + pado(n - 3);
        }
        return memo[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(bf.readLine());
            sb.append(pado(n)).append('\n');
        }
        System.out.println(sb);
    }
}
