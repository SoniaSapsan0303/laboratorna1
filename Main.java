import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int number = getNumber();
        if (number < 0) {
            System.out.println("You have entered the wrong number!");
            return;
        }
        Fibonacci fibonacci = new Fibonacci(number);
        fibonacci.showNumbers();
    }

    static public int getNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(the number can not be less than 1): ");
        int num = in.nextInt();
        in.close();
        return num;
    }
}

class Fibonacci {
    int amount;

    Fibonacci(int a) {
        amount = a;
    }

    public void showNumbers() {
        int counter;
        double fibonacci = 1, temp1 = 0, temp2 = 0;
        for (counter = 0; counter < amount; counter++) {
            if (fibonacci == 1) {
                System.out.println(fibonacci);
                showTheResult(fibonacci);
                temp2 = fibonacci++;
                continue;
            } else if (fibonacci == 2) {
                System.out.println(fibonacci);
                showTheResult(fibonacci);
                temp1 = fibonacci;
                fibonacci = temp2 + temp1;
                temp2 = fibonacci;
                continue;
            }
            System.out.println(fibonacci);
            showTheResult(fibonacci);
            fibonacci = temp2 + temp1;
            temp1 = temp2;
            temp2 = fibonacci;
        }
    }

    boolean checkTheNumber(double n) {
        return Math.sqrt(n) == (int) (Math.sqrt(n));
    }

    void showTheResult(double n) {
        if (checkTheNumber(n))
            System.out.println("The number is a perfect square");
        else System.out.println("The number is not a perfect square");
    }
}

