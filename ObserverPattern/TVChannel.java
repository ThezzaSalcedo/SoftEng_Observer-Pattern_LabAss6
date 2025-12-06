package ObserverPattern;

public class TVChannel implements Subscriber {
    private String channelName;

    public TVChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        System.out.println("Live on " + channelName + ": " + news);
    }

    @Override
    public String getName() {
        return channelName;
    }
}
