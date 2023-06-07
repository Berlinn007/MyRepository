import java.util.Scanner;
public class PrimeNumber
{
  private int number;
    public void setNumber(int number)
    {
        this.number = number;
    }
    public int getNumber()
    {
        return this.number;
    }

    public static String isPrime(int number)
    {
        String result = null;
        if(number ==1 || number == 0)
            return "Not Prime";
        else
        {
            int temp = 2;
            while(temp<=Math.sqrt(number))
            {
               int flag = number%temp==0?1:0;
                temp++;
               if(flag == 1)
               {
                   result = "Not Prime";
                   break;
               }
               else
                   result = "Prime Number";
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.println(isPrime(input.nextInt()));
    }
}
