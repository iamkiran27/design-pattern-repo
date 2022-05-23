package ObserverDP;

public class Main {

    public static void main(String[] args) {
        NewsLetterService newsLetterService = new NewsLetterService();
        new Subscriber1(newsLetterService);
        new  Subscriber2(newsLetterService);
        new Subscriber3(newsLetterService);
        System.out.println("Sending emails to the subscribers");
        newsLetterService.sendEmail();
    }
}
