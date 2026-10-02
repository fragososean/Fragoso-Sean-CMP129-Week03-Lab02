import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        Calculator cal = new Calculator();
        int a1, a2;
        double b1, b2;
        int c1, c2, c3;
        String w1, w2;

        System.out.println("Step 1: Adding Two Integers.");
        System.out.print("Enter an integer: ");
        a1 = input.nextInt();
        cal.setA1(a1);
        System.out.print("Enter another integer: ");
        a2 = input.nextInt();
        cal.setA2(a2);
        cal.add1();


        System.out.println("Step 2: Adding Two Decimal Values.");
        System.out.print("Enter a decimal: ");
        b1 = input.nextDouble();
        cal.setB1(b1);
        System.out.print("Enter another decimal: ");
        b2 = input.nextDouble();
        cal.setB2(b2);
        cal.add2();


        System.out.println("Step 3: Adding Three Integers.");
        System.out.print("Enter an integer: ");
        c1 = input.nextInt();
        cal.setC1(c1);
        System.out.print("Enter another integer: ");
        c2 = input.nextInt();
        cal.setC2(c2);
        System.out.print("Enter a third integer: ");
        c3 = input.nextInt();
        cal.setC3(c3);
        cal.add3();


        System.out.println("Step 4: Adding Words.");
        System.out.print("Enter a word of your choice: ");
        input.nextLine();
        w1 = input.nextLine();
        cal.setW1(w1);
        System.out.print("Enter a second word of your choice: ");
        w2 = input.nextLine();
        cal.setW2(w2);
        cal.con();

    }
}
