import java.util.Scanner;

public class PatternElephantBlinking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        drawElephant(num); // Call dynamic function with input number
    }

    public static void drawElephant(int num) {
        int mid = (num / 2) + 1;
        int head = 3;
        int tail = mid + 3;
        int nose = 3;
        int leg = 8;
        int nose1 = 5;
        int head1 = 8;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((i <= mid && i > 3 && j == 1)) {
                    System.out.print(" * ");
                } else if (head == j && i <= 3) {
                    System.out.print(" * ");
                    head--;
                } else if (i == 1 && j > 3 && j <= tail + 2) {
                    System.out.print(" * ");
                } else if (j == (tail + i) + 1 && i <= mid) {
                    System.out.print(" * ");
                } else if (j == num && i <= mid - 3 && i >= mid - 4) {
                    System.out.print(" * ");
                } else if (j == (tail + i - 3) + 1 && i < mid && i >= 4) {
                    System.out.print(" * ");
                } else if (j == tail + 2 && i >= 4) {
                    System.out.print(" * ");
                } else if (j == 8 && i >= 6 && i <= num - 3) {
                    System.out.print(" * ");
                } else if (i >= mid && i <= mid + 2 && j == i - mid + 1) {
                    System.out.print(" * ");
                } else if (i >= mid + 2 && j == 3 && i <= num - 3) {
                    System.out.print(" * ");
                } else if (i >= num - 4 && j == nose) {
                    System.out.print(" * ");
                    nose--;
                } else if (i == mid + 3 && j >= mid && j <= mid + 2) {
                    System.out.print(" * ");
                } else if (j == mid && i >= mid + 3 && i <= num) {
                    System.out.print(" * ");
                } else if (j == mid + 2 && i >= mid + 3 && i <= num) {
                    System.out.print(" * ");
                } else if (i >= num - 4 && j == leg) {
                    System.out.print(" * ");
                    leg--;
                } else if (i == num && j >= mid - 4 && j <= mid) {
                    System.out.print(" * ");
                } else if (i == num && j >= mid + 2 && j <= tail + 2) {
                    System.out.print(" * ");
                } else if (j == 3 && i == 5 || j == 4 && i == 4 || j == 3 && i == 4 || j == 4 && i == 5) {
                    System.out.print(" * ");
                } else if (i >= mid - 3 && j == 3 && i < mid) {
                    System.out.print(" * ");
                } else if (i >= mid + 2 && j == 5 && i < num - 2) {
                    System.out.print(" * ");
                } else if (i >= num - 3 && j == nose1) {
                    System.out.print(" * ");
                    nose1--;
                } else if (i == num && j == 2) {
                    System.out.print(" * ");
                } else if (i >= mid && i <= mid + 2 && j == i - mid + 3) {
                    System.out.print(" * ");
                } else if (i == 7 && j == 6 || i == 7 && j == 5 || i == 7 && j == 4 && i <= mid) {
                    System.out.print(" * ");
                } else if (head1 == j && i >= 5 && i <= 7) {
                    System.out.print(" * ");
                    head1--;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

            // Optional delay for animation effect (can be removed if not needed)
            try {
                Thread.sleep(100); // 100 ms delay after each line
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
