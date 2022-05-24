package momentoDP;

public class GitObserver {
    private  String commitMsg;



public  Momento saveToMomento(String message)
{
    System.out.println(message + " saved successfully.");
    return  new Momento(message);

}

public void restoreFormMomento(Momento momento)
{
    commitMsg = momento.getMessage();
    System.out.println("Restored to " + commitMsg);

}
}
