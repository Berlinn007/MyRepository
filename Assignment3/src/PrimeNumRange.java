import java.util.Scanner;
public class PrimeNumRange
{
    private int low;
    private int high;
    public static void primeRange(int low, int high)
    {
        for(int i = low;i<=high;i++)
        {
            int temp =2;
            if(i==1||i==0)
                continue;
            else
            {
                int flag = 0;
                while(temp<=Math.sqrt(i))
                {
                    if(i%temp==0) flag =1;
                    temp++;
                }
                if(flag ==0)
                {System.out.println(i+" Prime Number");}
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        primeRange(input.nextInt(),input.nextInt());
    }
}
