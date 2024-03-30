// Duck numbers are numbers that contain the digit zero (0) but are not starting with zero. 
// For example, 102, 230, 40506 are duck numbers because they contain the digit 0 but don't start with it.
//  On the other hand, numbers like 0102, 0034, 0708 are not duck numbers because they start with the digit 0.

import java.util.*;

public class DuckNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String numStr = sc.next();
        int count = 0;
        boolean isFirstDigit = true;

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            if (digit == '0' && !isFirstDigit) {
                count++;
                break;
            }
            if (isFirstDigit) {
                isFirstDigit = false;
            }
        }

        if (count > 0) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }
    }
}
