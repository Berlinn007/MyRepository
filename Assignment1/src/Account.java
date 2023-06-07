public class Account
{
private String id;
private String name;
private int balance;

    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getBalance()
    {
        return balance;
    }

    public int credit(int amount)
    {
        balance = balance+amount;
        return balance;
    }
    public int debit(int amount)
    {
      int temp = amount<=balance?balance-amount:-1;
        if(temp==-1)
            System.out.println("Amount exceeded balance");
        else
            this.balance = temp;
        return balance;
    }
    public int transferTo(Account another, int amount)
    {
        int temp = amount<=balance?another.balance = another.balance+amount:-1;
        if(temp==-1)
            System.out.println("Amount exceeded balance");
        else
            this.balance = temp;
        return this.balance;
    }
    @Override
    public String toString()
    {
        return "Account[id = "+id+", name = "+name+", balance = "+balance+"]";
    }
}
