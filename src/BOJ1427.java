import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1427 {
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
            while(arr[pl] > p) pl++;
            while (arr[pr] < p) pr--;
            if(pl <= pr) swap(arr, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(arr, left, pr);
        if (pl < right) quickSort(arr, pl, right);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split("");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]);
    }
}
