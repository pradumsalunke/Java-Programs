import java.util.*;

class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int i;
        for (i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                System.out.println(num + " is a PerfectSquareRoot number");
                break;
            }
        }

        if (i > num / 2) {
            System.out.println(num + " is not a PerfectSquareRoot number");
        }

        }
    }

