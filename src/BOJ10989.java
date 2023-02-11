import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void quickSort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int p = arr[(pl + pr) / 2];

        do {
            while(arr[pl] < p) pl++;
            while (arr[pr] > p) pr--;
            if(pl <= pr) swap(arr, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(arr, left, pr);
        if (pl < right) quickSort(arr, pl, right);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // StringBuilder 써야 맞음
        int N = Integer.parseInt(bf.readLine());
        int num[] = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(bf.readLine());
        }
        quickSort(num, 0, N - 1);
        for (int i = 0; i < N; i++) sb.append(num[i]).append('\n');
        System.out.println(sb);
    }
}
