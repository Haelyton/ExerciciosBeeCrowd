import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        System.out.println("Digite valor de num1");
        for (int i = 0; i < m; i++){
            nums1[i] = scanner.nextInt();
        }

        System.out.println("Digite valor de num2");
        for (int i = 0; i < n; i++){
            nums2[i] = scanner.nextInt();
        }

        int[] arrays = new int[m + n - 1];

        for (int i = 0; i < nums1.length; i++){
            arrays[i] = nums1[i];

        }

        for (int i = 0; i < nums2.length; i++){
            arrays[i + nums1.length] = nums2[i];
        }
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

    }
}