package ObserverDP;

public class Subscriber3 extends  NewsLetter {

    public Subscriber3(NewsLetterService newsLetterService) {
        this.newsLetterService = newsLetterService;
        this.newsLetterService.attach(this);
    }

    @Override
    public void sendMail() {
        System.out.println("Mail sent to Subscriber2");

    }
}
