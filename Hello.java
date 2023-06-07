import java.util.Scanner;
class Hello
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println("Hello "+s);
    }
}