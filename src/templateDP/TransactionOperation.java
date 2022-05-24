package templateDP;

public abstract  class TransactionOperation {

    public  abstract  void insertCard();
    public  abstract  void enterPin();
    public  abstract void enterAmount();
    public abstract void collectCash();

    public final  void process()
    {
        insertCard();
        enterPin();
        enterAmount();
        collectCash();

    }
}
