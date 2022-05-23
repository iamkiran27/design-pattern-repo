package StateDP;

public class TypingState implements  AppState{
    @Override
    public void performAction(AppContext context) {
context.setState(this);
this.typeContent();
    }


    private   void typeContent()
    {
        System.out.println("Typing content..");
    }
}
