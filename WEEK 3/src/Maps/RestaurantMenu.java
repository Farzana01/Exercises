package Maps;

import java.sql.Date;
import java.util.Scanner;

public class RestaurantMenu {

  //global variables
  public static double HAM  = 3.75;
  public static double CHEESE  = 4.10;
  public static double FRIES  = 2.50;
  public static double DRINKS  = 1.75;

  public static void main(String [] args)
  {
    //variables
    String order;
    double total = 0.0;
    boolean stopLoop;
    //print welcome message && collect order
    welcomeCustomer();
    order = collectItem();
    order = getGoodOrderLine(order);
    stopLoop = order.equalsIgnoreCase("q");


    while(!stopLoop)//while user hasnt typed q
    {
      if(order.equalsIgnoreCase("q"))
      {
        break;
      }
      order = getGoodOrderLine(order);
      //will add the value of user order to total here if order is valid
      //leave loop if useer inputs q
    }


    //ending program
    Date today = new Date(0);
    System.out.println("Date: " + today);
    System.out.println("Please pay " + total + "\n");
    System.out.println("End of processing");
  }
  public static void welcomeCustomer()
  {
    System.out.println("Welcome to QuickieBurger!");
    System.out.println("Hamburgers \t\t $" + HAM);
    System.out.println("cheeseBurgers\t\t $" + CHEESE);
    System.out.println("Fries\t\t\t $" + FRIES);
    System.out.println("Drinks\t\t\t $" + DRINKS+"\n");
  }
  public static String collectItem()
  {
    String userInput = null;
    Scanner kbd = new Scanner(System.in);

    System.out.println("Please place your order (e.g., 3 ham). Enter Q to quit.");
    userInput = kbd.nextLine();
    System.out.println(userInput);
    return userInput;
  }
  public static String getGoodOrderLine(String userInput)
  {
    String result = "";
    boolean pass = false;
    if(userInput.equalsIgnoreCase("q"))
    {
      return userInput;//early exit, return q
    }

    //check if it has at least a digit first
    for(char c: userInput.toCharArray())
    {
      if(Character.isDigit(c))
      {pass = true;}
    }

    //if it doesn't have a digit || string doesnt begin with a digit
    if(!Character.isDigit(userInput.charAt(0)))
    {
      if(!pass)
        System.out.println("Your entry "+ userInput + " should specify a quantity");
      else
        System.out.println("Your entry "+ userInput + " does not begin with a number");
    }
    else
    {
      //do the remaining tests here
    }
    return result;
  }

}
