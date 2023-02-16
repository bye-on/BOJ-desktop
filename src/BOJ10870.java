import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] N = new int[num + 1];
        N[0] = 0;
        N[1] = 1;
        for (int i = 2; i < num; i++) {
            N[i] = N[i - 1] + N[i - 2];
            N[i - 2] = N[i - 1];
            N[i - 1] = N[i];
        }
        System.out.println(N[num]);
    }
}
