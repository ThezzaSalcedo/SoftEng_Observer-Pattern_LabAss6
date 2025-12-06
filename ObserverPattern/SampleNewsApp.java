package ObserverPattern;

public class SampleNewsApp {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Subscriber zy = new PhoneUser("Zy");
        Subscriber euni = new PhoneUser("Euni");
        Subscriber cla = new TVChannel("cla");
        Subscriber lexa = new TVChannel("lexa");

        // Subscribe
        agency.subscribe(zy);
        agency.subscribe(euni);
        agency.subscribe(cla);

        // First news
        agency.publishNews("Cereal Killer Strike again by Killing Coco Crunch!");

        // Euni and lexa join later
        agency.subscribe(euni);
        agency.subscribe(lexa);

        // Second news
        agency.publishNews("Scientists discovers my will to live!");

        // ZY unsubscribes
        agency.unsubscribe(zy);

        // Third news (Zy won't get it)
        agency.publishNews("Couple of 4 years found out they're.........not for each other");
    }
}
