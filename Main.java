import java.util.Scanner;


public class Main{
  public static void main(String[]args){
    //Exercise 1
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter your name");
    // String userName = scanner.next();
    // System.out.println("Hello \n" + userName);
    // scanner.close();
    
    //Exercise 2
    // int num1 = 74;
    // int num2 = 36;
    // System.out.println(num1 + num2);
    
    //Exercise 3
    // int num1 = 50;
    // int num2 = 3;
    // System.out.println(num1 / num2);
    
    //Exercise 4
    // System.out.println("Enter first number: ");
    // Scanner scanner = new Scanner(System.in);
    // int num1 = scanner.nextInt();
    // System.out.println("Enter second number: ");
    // int num2 = scanner.nextInt();
    // int product = num1 * num2;
    // System.out.println(product);
    // scanner.close();
    
    //Exercise 5
    // System.out.println("Enter first number: ");
    // Scanner scanner = new Scanner(System.in);
    // int num1 = scanner.nextInt();
    // System.out.println("Enter second number: ");
    // int num2 = scanner.nextInt();
    // int product = num1 * num2;
    // int addition = num1 + num2;
    // int substraction = num1 - num2;
    // int division = num1 / num2;
    // int mod = num1 % num2;
    // System.out.println("The product is " + product);
    //  System.out.println("The addition is " +addition);
    //   System.out.println("The substraction is " +substraction);
    //    System.out.println("The division is " +division);
    //     System.out.println("The mod is " +mod);
    // scanner.close();
    
    //Exercise 7
    System.out.println("Enter number: ");
    //user the Scanner class to receive user input
    Scanner scanner = new Scanner(System.in);
    int userNumber = scanner.nextInt();
    //use a for loop to run a loop till the multiplication table gets to 10
    for(int i = 1; i<=10;i++){
      int multiply = userNumber *  i;
      System.out.println(userNumber+ " X " + i + " = " + multiply);
    }
    scanner.close();
  }


  
}