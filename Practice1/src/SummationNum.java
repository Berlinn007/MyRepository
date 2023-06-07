import java.util.Scanner;
public class SummationNum
{
    int number;
    SummationNum(int number)
    {
        this.number = number;
    }
    public static int summationNum(int number)
    {
        int result = 0,temp;

        while(number>0) {
            temp = number % 10;
            result += temp;
            number /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(summationNum(input.nextInt()));
    }

}

