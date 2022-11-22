import java.util.Scanner;

class Login {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

// Define multidimensional array with five rows and two columns

String[][] userDetails = new String[5][2];

// Initialize array with user details

userDetails[0][0] = "user1@gmail.com";

userDetails[0][1] = "pass1";

userDetails[1][0] = "user2@gmail.com";

userDetails[1][1] = "pass2";

userDetails[2][0] = "user3@gmail.com";

userDetails[2][1] = "pass3";

userDetails[3][0] = "user4@gmail.com";

userDetails[3][1] = "pass4";

userDetails[4][0] = "user5@gmail.com";

userDetails[4][1] = "pass5";

// Get email and password from user

System.out.print("Enter email: ");

String email = input.next();

System.out.print("Enter password: ");

String password = input.next();

// Compare user input with registered user details

for(int i=0; i<userDetails.length; i++) {

// If email and password match, redirect to welcome screen

if(userDetails[i][0].equals(email) && userDetails[i][1].equals(password)) {

System.out.println("Welcome Screen!");

break;

}

}

}

}