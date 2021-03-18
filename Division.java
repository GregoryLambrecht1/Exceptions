package exceptions;


import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d", num, den, div);
            keyboard.close();
        } catch (NumberFormatException | ArithmeticException t){
            System.out.println("invalid number / division by 0");
        } finally {
            System.out.println("the end");
        }
    }
}
