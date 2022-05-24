package StateDP;

public class InsertingState  implements  AppState{
    @Override
    public void performAction(AppContext context) {
        this.insertMedia();
        context.setState(this);
    }


    private   void insertMedia()
    {
        System.out.println("Inserting media...");
    }
}
