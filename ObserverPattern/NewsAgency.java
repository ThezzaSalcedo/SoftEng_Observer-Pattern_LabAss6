package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    // Add a subscriber
    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println(s.getName() + " subscribed!");
    }

    // Remove a subscriber
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println(s.getName() + " unsubscribed!");
    }

    // When news breaks, notify ALL subscribers
    public void publishNews(String news) {
        System.out.println("\nBREAKING NEWS: " + news);
        for (Subscriber s : subscribers) {
            s.update(news);  // Push the news to each subscriber
        }
        System.out.println();
    }
}
