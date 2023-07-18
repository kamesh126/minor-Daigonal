import java.util.Scanner;

public class minorDaigonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row size ");
        int n = sc.nextInt();
        System.out.println("coloum size ");
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter " + i + "," + j);
                A[i][j] = sc.nextInt();
            }
        }

        int i=0,j=n-1;
        int sum=0;
        while(i<n && j>=0) {
            sum+=A[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
    }
}