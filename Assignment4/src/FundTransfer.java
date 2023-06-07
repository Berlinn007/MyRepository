
import java.util.Scanner;
public class FundTransfer
{
    private int source;
    private int destination;

    static int transferLimit;
    static int transferAmount;
    public static void fundTransfer(Account source, Account dest) throws AccountNotFoundException,TransferLimitExceededException,InsufficientFundsException
    {
        if(source.getAccountNumber()!=12345 || dest.getAccountNumber()!=67890)throw new AccountNotFoundException();

        if(transferLimit<transferAmount)throw new TransferLimitExceededException();
        else if (source.getAccountBalance()<transferAmount)throw new InsufficientFundsException();
        else
        {
            source.setAccountBalance(source.getAccountBalance()-transferAmount);
            dest.setAccountBalance(dest.getAccountBalance()+transferAmount);
            System.out.println("Transfer of "+transferAmount+" is Succesfully done.");
            System.out.println("Available balance is : "+dest.getAccountBalance());
        }


    }

    public static void main(String[] args) throws AccountNotFoundException,TransferLimitExceededException {
        Scanner sc= new Scanner(System.in);
        transferLimit = 25000;
        System.out.println("Enter the Source Account");
            int sourceAccount = sc.nextInt();
        System.out.println("Enter the Source Account Balance");
            int sourceAmount = sc.nextInt();
        System.out.println("Enter the Destination Account");
        int destinationAccount = sc.nextInt();
        System.out.println("Enter the Destination Account Balance");
        int destinationAmount = sc.nextInt();
        System.out.println("Enter Money to be transfered");
         transferAmount = sc.nextInt();

    try {
        fundTransfer(new Account(sourceAccount, sourceAmount), new Account(destinationAccount, destinationAmount));
    }
    catch (InsufficientFundsException e)
    {
        e.printStackTrace();
    }

{

}




    }
}
