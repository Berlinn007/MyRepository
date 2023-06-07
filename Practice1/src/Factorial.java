import java.util.Scanner;
public class Factorial
{
    private int number;
    public static int calcFactorial(int number)
    {
        int result = 1;
//        result *= number==1||number==0?1:calcFactorial(number-1);
        if(number==0||number == 1)
            return 1;
        else
        {
         for(int i=number;i>1;i--)
         {
             result*=i;
         }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(calcFactorial(input.nextInt()));
    }
}
