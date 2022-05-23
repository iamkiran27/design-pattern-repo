package ObserverDP;

import java.nio.channels.NonReadableChannelException;

public class Subscriber2 extends  NewsLetter{

    public Subscriber2(NewsLetterService newsLetter) {
        this.newsLetterService = newsLetter;
        this.newsLetterService.attach(this);
    }

    @Override
    public void sendMail() {
        System.out.println("Mail sent to Subscriber2");

    }
}
