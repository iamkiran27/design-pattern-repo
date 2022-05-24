package momentoDP;

public class Main {
    public static void main(String[] args) {
        GitObserver gitObserver= new GitObserver();

        CareTaker careTaker = new CareTaker();
        careTaker.addMomento(gitObserver,"commit - 1");
        careTaker.addMomento(gitObserver, "commit -2 ");
        careTaker.addMomento(gitObserver, "commit - 3");
        careTaker.restoreFromMomento(gitObserver,1);
    }
}
