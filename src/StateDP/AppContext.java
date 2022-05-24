package StateDP;

public class AppContext {
    private AppState state;

    public AppContext(){
        state = null;
    }

    public void setState(AppState state){
        this.state = state;
    }

    public AppState getState(){
        return state;
    }
}
