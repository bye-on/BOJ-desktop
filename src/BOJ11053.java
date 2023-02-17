import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] num = new int[n];
        String[] str = bf.readLine().split(" ");
        int[] cnt = new int[n];
        int result = 1;
        for(int i = 0; i < n; i++) {
            cnt[i] = 1;
            num[i] = Integer.parseInt(str[i]);
            for(int j = 0; i > j; j++) {
                if(num[i] > num[j]) {
                    cnt[i] = Math.max(cnt[i], cnt[j] + 1);
                }
            }
            result = Math.max(result, cnt[i]);
        }
        System.out.println(result);
    }
}
