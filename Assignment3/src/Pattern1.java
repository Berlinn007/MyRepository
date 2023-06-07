import java.util.Scanner;
public class Pattern1
{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the Line to be drawn for Pattern of 'A'");
        int pattern = input.nextInt();
        for(int i = 0;i<pattern;i++)
        {
            for(int j = 0;j<(pattern*2);j++)
            {
                if(i==0&&j==pattern)
                System.out.print("*");
                else if(j==pattern-i || j==pattern+i)
                    System.out.print("*");
                else if(i==pattern/2 && (j>pattern-i && j< pattern+i && j%2!=0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
