import java.util.*;

class PerfectSquareRoot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean found = false;
        int i;
        for (i = 1; i <= num ; i++) {
            if (i * i == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(num + " is a PerfectSquareRoot number");
        } else {
            System.out.println(num + " is not a PerfectSquareRoot number");
        }

        sc.close();
    }
}
