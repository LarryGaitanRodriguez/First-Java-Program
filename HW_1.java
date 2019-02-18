/* Name: HW_1.java
 * Description: HW_1 prompts the user to enter a three values that represent the Hour, Minute, and Second. 
 *              The program will then calculate all those values into the total number of seconds 
 *              and the total number of days.
 *
 * Author: Larry Gaitan-Rodriguez
 * Creation: 9/13/18
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class HW_1
{
  public static void main(String[] args)
  {
    /* The following constants are for the mathematical calculation that 
     * convert Minutes, Hours, and days, into seconds. I.E 2*MINUTE = 120 Seconds.
     */
    final int MINUTE = 60;
    final int HOUR = 60;
    final int DAY = 24;
    //Creates all the user prompt variables.
    int user_hours, user_minutes, user_seconds; 
    //Creates the variables used to store the output results. 
    int total_seconds;
    float total_days;
    
    Scanner scan = new Scanner(System.in);
   
    System.out.println("Please enter the amount of hours: ");
    user_hours = scan.nextInt();
    
    System.out.println("Please enter the amount of minutes: ");
    user_minutes = scan.nextInt();
                       
    System.out.println("Please enter the amount of seconds: ");
    user_seconds = scan.nextInt();
     
    DecimalFormat fmt = new DecimalFormat("0.##");
    //The mathematical calculation for converting Hours and minutes into seconds and add the seconds user entered.
    total_seconds = (user_hours*HOUR*MINUTE)+(user_minutes*MINUTE)+user_seconds;
    //The mathematical calculation for converting Hours, Minutes, and Seconds into days. 
    total_days = (float)(total_seconds/MINUTE/HOUR/DAY);
    
    //The following is a friendly computer output of the previous mathematical calculations.
    System.out.println("Thank you. I found that the total number of seconds was "+total_seconds+" Seconds.");
    System.out.println("I found that the total number days is "+fmt.format(total_days)+" days. Have a wonderful day.");
    
  }
}
                       
   
 