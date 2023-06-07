public class AccountNotFoundException extends Exception
{
    AccountNotFoundException()
    {
        super("The source account or the destination account does not exist");
    }
}
