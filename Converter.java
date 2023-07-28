import java.util.Scanner;
import java.text.DecimalFormat;

public class Converter {
    public static void main(String[] args){

        double amount;
        double INR, USD, EUR, POUND;
        int fromCurr;
        DecimalFormat f = new DecimalFormat("##.###");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("-----WELCOME TO MY CURRENCY CONVERTOR-----");
        System.out.println();

        System.out.print("Enter Amount = ");
        amount = sc.nextFloat();
        System.out.println("Select from which you want to convert : ");
        System.out.print(" 1.INR\n "+"2.USD\n "+"3.EUR\n "+"4.POUND\n ");
        fromCurr = sc.nextInt();

       switch(fromCurr){

           case 1:  
               USD = amount * 0.012 ;
               System.out.println(amount + " Rupee = " + f.format(USD) + " Dollars");

               EUR = amount * 0.011;
               System.out.println(amount + " Rupee = " + f.format(EUR) + " Euros");

               POUND = amount * 0.0097 ;
               System.out.println(amount + " Rupee = " + f.format(POUND) + " Pounds");
               break;

           case 2:  
               INR = amount * 82.83;
               System.out.println(amount + " Dollar = " + f.format(INR) + " Ruppes");

               EUR = amount * 0.93;
               System.out.println(amount + " Dollar = " + f.format(EUR) + " Euros");

               POUND = amount * 0.81;
               System.out.println(amount + " Dollar = " + f.format(POUND) + " Pounds");
               break;

           case 3: 
               INR = amount * 89.27;
               System.out.println(amount + " euro = " + f.format(INR) + " Ruppes");

               USD = amount * 1.08;
               System.out.println(amount + " euro = " + f.format(USD) + " Dollars");

               POUND = amount * 0.87;
               System.out.println(amount + " euro = " + f.format(POUND) + " Pounds");
               break;

           case 4: 
               INR = amount * 102.58;
               System.out.println(amount + " pound = " + f.format(INR) + " Ruppes");

               USD = amount * 1.24;
               System.out.println(amount + " pound = " + f.format(USD) + " Dollars");

               EUR = amount * 1.15;
               System.out.println(amount + " pound = " + f.format(EUR) + " Euros");
               break;

           default:
               System.out.println("Invalid Input, Please enter again..... ");
       }

    }

}