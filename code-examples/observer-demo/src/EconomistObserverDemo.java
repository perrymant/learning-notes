import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EconomistObserverDemo {
    public static void main(String[] args) {
        Economist economist = new Economist();
        List<Subscriber> subscriptionList = Arrays.asList(
            new OnlineSubscription(economist), 
            new MobileSubscription(economist),
            new PhysicalSubscription(economist),
            new OnlineSubscription(economist), 
            new MobileSubscription(economist)
        );

        for (int i = 0; i < 15; i++) {
            economist.onEvent(new Publication());
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Publication {

    Publication() {
        System.out.println("A new set of reviews for the subscribers of magazines at: " 
        + new Timestamp(new Date().getTime()));
    }
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
        System.out.println(OnlineSubscription.class.getName() + " of the Economist gives a rating: " + (int) (Math.random() * 6) + 1);
    }
}

class PhysicalSubscription implements Subscriber {
    PhysicalSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Publication ev) {
        System.out.println(PhysicalSubscription.class.getName() + " of the Economist gives a rating: " + (int) (Math.random() * 6) + 1);
    }
}

class MobileSubscription implements Subscriber {
    MobileSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Publication ev) {
        System.out.println(MobileSubscription.class.getName() + " of the Economist gives a rating: " + (int) (Math.random() * 6) + 1);
    }
}