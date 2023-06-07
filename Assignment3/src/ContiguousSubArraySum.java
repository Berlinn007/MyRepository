import javax.swing.*;
import java.util.Scanner;
public class ContiguousSubArraySum
{
    private int[] arr;
    ContiguousSubArraySum(int[] arr)
    {
        this.arr = arr;
    }
    public static int subArraySum(int[] arr,int subArr)
    {
        int result = 0;
           for(int i = 0;i<=arr.length-subArr;i++)
           {
               int temp = 0,j=i,sum = 0;
               while(temp<subArr)
               {
                   sum+=arr[j];
                   j++;
                   temp++;
               }
               result = sum>result?sum:result;

           }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i =0 ; i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the size of SubArray");
        System.out.println(subArraySum(arr,input.nextInt()));
    }
}
