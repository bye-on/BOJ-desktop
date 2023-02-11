import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750 {
    public static void SWAP(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int num[] = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(bf.readLine());
        }
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                if(num[i] > num[j]) SWAP(num, i, j);
            }
            System.out.println(num[i]);
        }
    }
}
