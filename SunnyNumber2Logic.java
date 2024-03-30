import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int newNum = num + 1;
        boolean isSunny = false;

        for (int i = 1; i * i <= newNum; i++) {
            if (i * i == newNum) {
                isSunny = true;
                break;
            }
        }

        if (isSunny) {
            System.out.println(num + " is a sunny number");
        } else {
            System.out.println(num + " is not a sunny number");
        }

        sc.close();
    }
}
