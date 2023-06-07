import java.util.Scanner;
public class SumEvenNumberLimit
{
    private int number;
    private int limit;
    SumEvenNumberLimit(int number,int limit)
    {
        this.number = number;
        this.limit = limit;
    }
    public static int sumEvenNumberLimit(int number, int limit)
    {
        int sum=0;
        for(int i = 1;i<=number;i++)
        {
            int temp =2;
            if(i==1)
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
                {sum+=i;}
             }

        }
        if(sum>limit){
            System.out.println("Sum limit Exceeded");
            return -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int number = input.nextInt();
        System.out.println("Enter the Limit of sum");
        int limit = input.nextInt();
        System.out.println(sumEvenNumberLimit(number,limit));
    }
}
