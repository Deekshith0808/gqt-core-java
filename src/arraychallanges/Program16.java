package arraychallanges;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter rotation direction (left/right):");
        String dir = sc.next();
        System.out.println("Enter number of positions to rotate:");
        int k = sc.nextInt();
        k = k % n;

        int[] res = new int[n];

        if (dir.equals("left")) {
            for (int i = 0; i < n; i++) {
                res[i] = a[(i + k) % n];
            }
        } else {
            for (int i = 0; i < n; i++) {
                res[(i + k) % n] = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
