import java.util.Scanner;
public class VowelsCount
{
    private String str;
    VowelsCount(String str)
    {
        this.str = str;
    }

    public static int vowelsCount(String str)
    {
        int result = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.toLowerCase().charAt(i) == 'a'||str.toLowerCase().charAt(i) == 'e'|| str.toLowerCase().charAt(i) == 'o'|| str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'u')
            {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(vowelsCount(input.nextLine()));
    }
}
