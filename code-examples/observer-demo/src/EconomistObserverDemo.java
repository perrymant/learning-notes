import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EconomistObserverDemo {
    private static final Economist ECONOMIST = new Economist();
    private static final List<Subscriber> subscriptionList = Arrays.asList(
        new OnlineSubscription(ECONOMIST), 
        new MobileSubscription(ECONOMIST),
        new PhysicalSubscription(ECONOMIST),
        new OnlineSubscription(ECONOMIST), 
        new MobileSubscription(ECONOMIST)
    );

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            economist.onEvent(new Publication());
            hangOn();
        }
    }

    private static void hangOn() {
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Publication {
}

class Economist {
    private Set<Subscriber> subscribers = new HashSet<>();

    void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    void onEvent(Publication ev) {
        for (Subscriber ob : subscribers) {
            ob.notify(ev);
        }
    }
}

interface Subscriber {
    void notify(Publication ev);
}

class OnlineSubscription implements Subscriber {
    OnlineSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Publication ev) {
        System.out.println("Online Subscription of the Economist gives a rating: " + (int) (Math.random() * 6) + 1);
    }
}

class PhysicalSubscription implements Subscriber {
    PhysicalSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Publication ev) {
        System.out.println("Physical Subscription of the Economist gives a rating: " + (int) (Math.random() * 6) + 1);
    }
}

class MobileSubscription implements Subscriber {
    MobileSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Publication ev) {
        System.out.println("Mobile Subscription of the Economist gives a rating: " + (int) (Math.random() * 6) + 1);
    }
}