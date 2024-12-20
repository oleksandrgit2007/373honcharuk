package ua.com.kisit.KR.Task3;

public class Triangle {
    public static void main(String[] args) {
        int n = 7; // Pозмір трикутника
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= (2 * n - 1)) {
                if (j == n - i + 1 || j == n + i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

