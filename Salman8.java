import java.util.Scanner;

class Program {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter x and y values for addition, substraction, multiplication and division:");

int x = input.nextInt();

int y = input.nextInt();

System.out.println("x + y = " + (x + y));

System.out.println("x - y = " + (x - y));

System.out.println("x * y = " + (x * y));

System.out.println("x / y = " + (x / y));

}

}