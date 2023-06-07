import java.util.Scanner;
public class DetermineChar
{
    private char chr;

    public void setChar(char chr)
    {
        this.chr = chr;
    }
    public char getChar()
    {
        return this.chr;
    }
    public DetermineChar(){}
    public DetermineChar(char chr)
    {
        this.chr = chr;
    }
    public static String determineChar(char chr)
    {
        String result = null;
        result = chr>=65&&chr<=90?"Upper Case":chr>=97&&chr<=122?"Lower Case":chr>=48&&chr<=57?"Number":"Special Character";
        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char chr = input.next().charAt(0);
        System.out.println(determineChar(chr));
    }
}
