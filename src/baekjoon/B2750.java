package baekjoon;

import java.io.*;
import java.util.Arrays;

public class B2750 {    // 수 정렬하기 (정렬)

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int val : arr) {
            System.out.println(val);
        }

    }
}
