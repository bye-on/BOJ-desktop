import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {
    public static int[] memo = new int[12];
    public static int Plus(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        if(memo[n] == 0) {
            memo[n] = Plus(n - 1) + Plus(n - 2) + Plus(n - 3);
        }
        return memo[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(bf.readLine());
            sb.append(Plus(n)).append('\n');
        }
        System.out.println(sb);
    }
}
