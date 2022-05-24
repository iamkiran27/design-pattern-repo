package StateDP;

public class EditingState  implements  AppState{

    @Override
    public void performAction(AppContext context) {
        this.editFIle();
        context.setState(this);

    }

    private   void editFIle()
    {
        System.out.println("Editing the file...");
    }


}
