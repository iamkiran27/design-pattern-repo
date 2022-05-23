package ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsLetterService {
    private List<NewsLetter> newsLetterList = new ArrayList<NewsLetter>();




    public void sendEmail() {

        notifyAllObservers();
    }

    public void attach(NewsLetter newsLetter){
        newsLetterList.add(newsLetter);
    }

    public void notifyAllObservers(){
        for (NewsLetter newsLetter : newsLetterList) {
            newsLetter.sendMail();
        }
    }
}
