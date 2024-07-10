import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of //ERROR HANDLER 1
//        two numbers , takes two numbers as input
        Scanner input = new Scanner(System.in);
//        try {
//            System.out.println("please enter number 1:");
//            int num1 = input.nextInt();
//            System.out.println("please enter number 2:");
//            int num2 = input.nextInt();
//            while (true) {
//                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
//                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
//                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
//                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
//                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
//                break;
//            }
//        }catch (InputMismatchException e){
//            System.out.println("sorry numbers only..");
//        }catch (ArithmeticException e){
//            System.out.println("zero not allowed with division..");
//        }
//        Write a Java program that takes a number as input and prints its multiplication table up to 10.
//        Test Data: //ERROR HANDLER 2
        // same input data at line 11
//        try {
//            System.out.println("please enter number 1:");
//            int num1 = input.nextInt();
//            System.out.println("please enter number 2:");
//            int num2 = input.nextInt();
//        for (int i = 0 ; i <= 10 ; i++){
//            System.out.println(num1+"*"+ i +"="+(num1*i));
//        }}catch (MissingFormatArgumentException e){
//            System.out.println("Sorry numbers only..");
//        }
//        3. Write a Java program to print the area and perimeter of a circle. //ERROR HANDLER 3
//                 try {
//            System.out.print("Enter the radius of the circle: ");
//            double radius = input.nextDouble();
//
//            double area = 22 * radius * radius / 7;
//            double perimeter = 2 * 22 * radius / 7;
//
//            System.out.println("Perimeter is: " + perimeter);
//            System.out.println("Area is: " + area);
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }

//        4. Java program to find out the average of a set of integers //ERROR HANDLER 4
//        try {
//        System.out.println("please enter the count for numbers:");
//        int num = input.nextInt();
//        double res=0.0;
//        for (int i = 1 ; i<= num ; i++){
//            System.out.println("please enter number:");
//            int num2  = input.nextInt();
//             res += num2;
//        }
//        System.out.print("the average is "+ (res / num));
//        }catch (Exception e){
//            System.out.println("sorry error accured..");
//        }

//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer. //ERROR HANDLER 5
//
//        System.out.println("please enter number 1 :");
//        int num1 = input.nextInt();
//        System.out.println("please enter number 2 :");
//        int num2 = input.nextInt();
//        System.out.println("please enter number 3 :");
//        int num3 = input.nextInt();
//        try {
//            result(num1,num2,num3);
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//        public static void result(int num1, int num2, int num3) throws Exception {
//            boolean result1 = true;
//            boolean result2 = false;
//        if (num1+num2 == num3){
//            System.out.printf("the result is "+ result1);
//        }
//       else {
//            System.out.printf("the result is "+ result2);
//        }if (num1+num2 != num3){
//                    throw new Exception(" sorry ivnalid ");
//            }

//        6. Write a Java program to reverse a word. 6
//
//        try {
//            System.out.print("Enter a word: ");
//            String word = input.nextLine();
//            boolean containsDigit = false;
//            for (char c : word.toCharArray()) {
//                if (Character.isDigit(c)) {
//                    containsDigit = true;
//                    break;
//                }
//            }
//            if (containsDigit) {
//                throw new InputMismatchException("Input must be a word no numbers.");
//            }
//            String result = "";
//            System.out.println("Original word: " + word);
//
//            for (int i = word.length() - 1; i >= 0; i--) {
//                char o = word.charAt(i);
//                result += o;
//            }
//
//            System.out.println("Reversed word: " + result);
//        } catch (InputMismatchException e) {
//            System.out.println("Error: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("An unexpected error occurred. Please try again.");
//        }
//        7 -  Java program to check whether the given number is even or odd //ERROR HANDLER 7
//        try {
//            System.out.println("please enter number  :");
//            int num1 = input.nextInt();
//            if ((num1 % 2 == 0)) {
//                System.out.println("number is even");
//            } else {
//                System.out.println("number is odd");
//            }
//        }catch (InputMismatchException e){
//        System.out.println("numbers only.. ");
//    }
//        8 - Java program to convert the temperature in Centigrade to Fahrenheit //ERROR HANDLER 8
//       try {
//           System.out.println(" enter temperature in Centigrade :");
//           double num1 = input.nextInt();
//           double Fahrenheit = (num1 * 9 / 5) + 32;
//           System.out.println("temperature in Fahrenheit is:" + Fahrenheit);
//       }catch (InputMismatchException e){
//           System.out.println("numbers only..");
//       }
//        .Write a Java program that takes a string and a number from the user,then prints the 9
//        character in the given index.
//try {
//    System.out.println(" enter String :");
//    String word = input.nextLine();
//    System.out.println(" enter number :");
//    word = word.trim();
//    int num1 = input.nextInt();
//    char o = word.charAt(num1);
//    System.out.println(o);
//}catch (InputMismatchException e){
//    System.out.println("Try again please..");
//}catch (StringIndexOutOfBoundsException e){
//    System.out.println("Try again please..");
//}
//        10. Write a Java program to print the area and perimeter of a rectangle. 10
//        double width = 0;
//        double height;
//        try {
//            System.out.print("Enter the width of the rectangle: ");
//             width = input.nextDouble();
//        } catch (InputMismatchException e ) {
//            System.out.println("numbers only");
//        }catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        try {
//            System.out.print("Enter the height of the rectangle: ");
//             height = input.nextDouble();
//            negative(width, height);
//            double area = width * height;
//            double perimeter = 2 * (width + height);
//            System.out.println("Area is " + width + " * " + height + " = " + area);
//            System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
//        } catch (InputMismatchException e ) {
//        System.out.println("numbers only");
//    }catch (Exception e) {
//        System.out.println("Error: " + e.getMessage());
//    }
//    }
//        public static void negative(double width, double height) throws Exception {
//           if(width <0 ) {
//               throw new Exception("ivnalid negative number ");
//           }
//           else if( height < 0) {
//                throw new Exception("ivnalid negative number ");
//            }
//        11. Write a Java program to compare two numbers. //ERROR HANDLER 11
//        try {
//            System.out.println(" enter number 1 :");
//            int num1 = input.nextInt();
//            System.out.println(" enter number 2 :");
//            int num2 = input.nextInt();
//            while (true) {
//                if (num1 != num2 && num1 < num2 && num1 <= num2) {
//                    System.out.println(num1 + "!=" + num2);
//                    System.out.println(num1 + "<" + num2);
//                    System.out.println(num1 + "<=" + num2);
//                }
//                break;
//            }
//        }catch (InputMismatchException e){
//            System.out.println("numbers only..");
//
//        }
//
    }


}
