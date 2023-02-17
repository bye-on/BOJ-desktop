import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1463 {
    public static void main(String[] args) throws IOException {
        int[] memo = new int[1000001];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + 1; // 1을 뺀 경우, 연산 한 번 했으니까 + 1
            if((i % 3) == 0) {
                memo[i] = Math.min(memo[i], memo[i / 3] + 1); // 1을 뺀 경우와 3 나눈 연산(+ 1) 비교
            }
            if((i % 2) == 0) {
                memo[i] = Math.min(memo[i], memo[i / 2] + 1); // 위에서 연산한 것과 2 나눈 연산(+ 1) 비교(예. 6인 경우)
            }
        }
        System.out.println(memo[n]);
    }
}
