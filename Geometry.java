import java.util.Scanner;
import java.lang.Math;
/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
      printMenu();
      choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value = circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = rectangleArea(length, width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(base, height);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = rectanglePerimeter(length, width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
              value = trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here

   public static void printMenu(){
    System.out.println("This is a geometry calculator");
            System.out.println("Choose what you would like to calculate:");
            System.out.println("1. Find the area of the circle");
            System.out.println("2. Find the area of a rectangle");
            System.out.println("3. Find the area of a triangle");
            System.out.println("4. Find the circumference of a circle");
            System.out.println("5. Find the perimeter of a rectangle");
            System.out.println("6. Find the perimeter of a triangle");
            System.out.println("Enter the number of your choice:");

          }
     // TASK #2 Create the value-returning methods here

      //Returns the area of the circle
      /*circleArea takes in the radius and using the formula
        A=pi*r^2 it returns the area of the circle*/
      //@param: radius - the radius of the circle
      //@return: the area of the circle
     public static double circleArea(double radius){
        return Math.PI*Math.pow(radius, 2);
     }
     //Returns the area of the rectangle
     /*rectangleArea takes in the length and width of the rectangle
       and multiplies them together to return the area of a rectangle*/
     /*@param: length - the length of the rectangle
               width - the width of the rectanlge*/
      //@return: the area of the rectangle
      public static double rectangleArea(double length, double width){
      return length*width;
     }
     //Returns the are of a triangle
     /*triangleArea takes in the base and the height of a triangle
       and uses the formula A=0.5*base*height to return the area of a triangle*/
     /*@param: base - the base of the triangle
               height - the height of the triangle*/
     //@return: the area of the triangle
     public static double triangleArea(double base, double height){
      return 0.5*base*height;
     }
     //Returns the circumference of a cirlce
     /*circleCircumference takes in the radius and calculates the circumference
       of a cirlce using the formula C=2*pi*radiua*/
     //@param: radius - the radius of the cicle
     //@return: the circumference of the circle
     public static double circleCircumference(double radius){
      return 2*Math.PI*radius;
     }
     //Returns the perimeter of a rectangle
     /*rectanglePerimeter takes in the length and width of a rectangle
       uses the formula P=2l*2w to calculate the perimeter*/
     /*@param: length - the length of the rectangle
               width - the width of the rectangle*/
     //@return: the perimeter of the reactangle 
     public static double rectanglePerimeter(double length, double width){
      return (2*length)+(2*width);
     }
     //Returns the perimeter of a triangle
     /*trianglePerimeter takes in the three sides of a triangle
       and adds them together to get the perimeter of a triangle*/
     /*@param: side 1 - the first side of the triangle
               side 2 - the second side of the triangle
               side 3 - the third side of the triangle*/
    //@return: the pereimeter of the triangle 
     public static double trianglePerimeter(double side1, double side2, double side3){
      return side1+side2+side3;
     }
   }
   // TASK #4 Write javadoc comments for each method
