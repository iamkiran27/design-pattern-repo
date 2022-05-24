package StateDP;

public class Main {
    public static  void main(String[] args) {
        AppContext appContext = new AppContext();
        System.out.println("Welcome to MS Word");
        TypingState typingState = new TypingState();
        typingState.performAction(appContext);

        EditingState editingState = new EditingState();
        editingState.performAction(appContext);

        RemovingState removingState = new RemovingState();
        removingState.performAction(appContext);

        InsertingState insertingState = new InsertingState();
        insertingState.performAction(appContext);
    }
}
