package ObserverDP;

public class Subscriber1 extends NewsLetter{


    public Subscriber1(NewsLetterService newsLetterService) {
        this.newsLetterService = newsLetterService;
        this.newsLetterService.attach(this);

    }

    @Override
    public void sendMail() {
        System.out.println("Mail sent to Subscriber1");
    }
}
