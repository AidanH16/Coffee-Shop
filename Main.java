import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      double americanoPrice = 1.00;
      double lattePrice = 1.50;
      double coldBrewPrice = 2.00;
      double breakfastSandwich = 2.50;
      double sugar = 0.50;
      double protein = 1.00;
      double subtotal = 0.00;
      int whileNumber = 0;
      int aB = 0;
      int lB = 0;
      int cB = 0;
      int bSB = 0;
      int aS = 0;
      int aP = 0;
      
      Scanner askUser = new Scanner(System.in);

      while (whileNumber == 0)
      {
       System.out.print("What would you like? 1 for an Americano, 2 for a Latte, \n3 for a Cold Brew, and 4 for a Breakfast Sandwich. \n\n");

       int choice = askUser.nextInt();
       if (choice == 1)
       {
        aB = aB + 1;

        System.out.println("Would you like to add sugar? 1 for yes, 2 for no \n");
        int choice5 = askUser.nextInt();

        if (choice5 == 1)
        {
          aS = aS + 1;
        }

        System.out.println("Would you like anything else? 1 for yes, 2 for no \n");
        int choice1 = askUser.nextInt();

        if (choice1 == 2)
        {
          whileNumber = whileNumber + 1;
        }
       }

       if (choice == 2)
       {
        lB = lB + 1;

        System.out.println("Would you like to add sugar? 1 for yes, 2 for no \n");
        int choice6 = askUser.nextInt();

        if (choice6 == 1)
        {
          aS = aS + 1;
        }

        System.out.println("Would you like anything else? 1 for yes, 2 for no \n");
        int choice2 = askUser.nextInt();

        if (choice2 == 2)
        {
          whileNumber = whileNumber + 1;
        }
       }

       if (choice == 3)
       {
        cB = cB + 1;

        System.out.println("Would you like to add sugar? 1 for yes, 2 for no \n");
        int choice7 = askUser.nextInt();

        if (choice7 == 1)
        {
          aS = aS + 1;
        }

        System.out.println("Would you like anything else? 1 for yes, 2 for no \n");
        int choice3 = askUser.nextInt();

        if (choice3 == 2)
        {
          whileNumber = whileNumber + 1;
        }
       }

       if (choice == 4)
       {
        bSB = bSB + 1;

        System.out.println("Would you like to add protein? 1 for yes, 2 for no \n");
        int choice8 = askUser.nextInt();

        if (choice8 == 1)
        {
          aP = aP + 1;
        }

        System.out.println("Would you like anything else? 1 for yes, 2 for no \n");
        int choice4 = askUser.nextInt();

        if (choice4 == 2)
        {
          whileNumber = whileNumber + 1;
        }
       }
     } 

      double beforeExtras = (aB * americanoPrice) + (lB * lattePrice) + (cB * coldBrewPrice) + (bSB * breakfastSandwich);
      double extras = (aS * sugar) + (aP * protein);
      subtotal = beforeExtras + extras;
      double total = subtotal * 1.07;

      System.out.println("Your total is $" + total + ".");
   }
}