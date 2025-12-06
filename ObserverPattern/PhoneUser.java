package ObserverPattern;

public class PhoneUser implements Subscriber {
    private String name;

    public PhoneUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Notification to " + name + "'s Phone: " + news);
    }

    @Override
    public String getName() {
        return name;
    }
}
