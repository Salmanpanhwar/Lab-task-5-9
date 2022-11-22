import java.util.Scanner;

class Main {

public static void main(String[] args) {

int foodItem;

Scanner scanner = new Scanner(System.in);

System.out.println("Please select a food item from the following menu:");

System.out.println("1 - Chicken Curry");

System.out.println("2 - Mutton Curry");

System.out.println("3 - Egg Curry");

System.out.println("4 - Madras Curry");

System.out.println("5 - Tikka Masala");

System.out.println("6 - Afghan Chicken Korma");

foodItem = scanner.nextInt();

switch (foodItem) {

case 1:

System.out.println("The price of Chicken Curry is Rs.180");

break;

case 2:

System.out.println("The price of Mutton Curry is Rs.200");

break;

case 3:

System.out.println("The price of Egg Curry is Rs.150");

break;

case 4:

System.out.println("The price of Madras Curry is Rs.350");

break;

case 5:

System.out.println("The price of Tikka Masala is Rs.250");

break;

case 6:

System.out.println("The price of Afghan Chicken Korma is Rs.400");

break;

default:

System.out.println("Invalid food item!");

}

}

}