public class TransferLimitExceededException extends Exception
{
    public TransferLimitExceededException() {
        super("Transfer amount exceeded the Limit of 25000");
    }
}
