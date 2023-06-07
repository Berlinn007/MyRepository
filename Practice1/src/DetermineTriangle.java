import java.util.Scanner;

public class DetermineTriangle
{
    private int side_one;
    private int side_two;
    private int side_three;
     DetermineTriangle(int side_one,int side_two,int side_three)
     {
         this.side_one = side_one;
         this.side_two = side_two;
         this.side_three = side_three;
     }
     public static String determineTriangle(int side_one,int side_two,int side_three)
     {
         return side_one==side_two&&side_two==side_three?"Equilateral Triangle":side_one==side_two&&side_two!=side_three?"Isosceles Triangle":"Scalene Triangle";
     }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int side_one = input.nextInt();
        int side_two = input.nextInt();
        int side_three = input.nextInt();
        System.out.println(determineTriangle(side_one,side_two,side_three));
    }


}
