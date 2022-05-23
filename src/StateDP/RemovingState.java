package StateDP;

public class RemovingState implements AppState {
    @Override
    public void performAction(AppContext context) {
        context.setState(this);
        this.removeContent();
    }


    private void removeContent()
    {
        System.out.println("Removing content from file.");
    }
}
