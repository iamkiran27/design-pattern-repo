package momentoDP;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Momento> momentos;

    public CareTaker() {
        this.momentos = new ArrayList<>();
    }

    public void  addMomento(GitObserver gitObserver, String message)
    {
momentos.add(gitObserver.saveToMomento(message));

    }

    public  void restoreFromMomento(GitObserver gitObserver,  int commitNo)
    {
        gitObserver.restoreFormMomento(momentos.get(commitNo));
    }
}
