import java.util.Scanner;
public class PalindromicSubstr
{
    public static String subStr(String palindrome)
    {
        int max= 1;
        int start = 0;
        for(int i = 0;i<palindrome.length();i++)
        {

            for(int j = i;j<palindrome.length();j++)
            {
                int flag = 1;
              for(int k = 0;k<(j-i+1)/2;k++)
              {
                  if(palindrome.charAt(i+k)!=palindrome.charAt(j-k))
                      flag=0;
              }
                if(flag!=0 && (j-i+1)>max)
                {
                    start = i;
                    max = j-i+1;
                }
            }
        }
        return palindrome.substring(start,start+max);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String palindrome = sc.nextLine();
        System.out.println(subStr(palindrome));
    }
}
