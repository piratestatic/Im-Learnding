public class ExampleOfNestedSwitch
{
   public static void main(String[] args)
   {
      //Declaring a variable for switch expression
      int year =;
      int marks = ;

      switch(year) //Switch expression
      {
         //Case statements
         case 1:
         System.out.println("First year students are not eligible for scholarship ");
         break;
         case 2:
         System.out.println("Second year students are not eligible for scholarship");
         break;
         case 3:
         switch(marks)
         {
            case 50:
            System.out.println("You are not eligible for scholarship");
            break;
            case 80:
            System.out.println("Congrats!!!!! you are eligible for scholarship");
            break;
         }
         break;
         //Default case statement
         default: System.out.println("Please enter valid year");
     }
   }
}