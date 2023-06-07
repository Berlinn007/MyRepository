import javax.swing.*;
import java.util.Scanner;
public class DetermineYear
{
  private int year;
  DetermineYear(int year)
  {
      this.year = year;
  }
  public static String determineYear(int year)
  {
      return year%4==0?"Leap Year":year%100==0&&year%400==0?"Leap Year":"Not a Leap Year";
  }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(determineYear(input.nextInt()));
    }

}
