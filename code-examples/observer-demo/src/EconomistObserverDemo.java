import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class EconomistObserverDemo {
    public static void main(String[] args) {
        Economist economist = new Economist();
        Subscriber onlineSubscriber01 = new OnlineSubscription(economist);
        Subscriber mobileSubscriber01 = new MobileSubscription(economist);
        Subscriber physicalSubscriber01 = new PhysicalSubscription(economist);
        Subscriber onlineSubscriber02 = new OnlineSubscription(economist);
        Subscriber mobileSubscriber02 = new MobileSubscription(economist);
        Subscriber physicalSubscriber02 = new PhysicalSubscription(economist);
        Subscriber onlineSubscriber03 = new OnlineSubscription(economist);
        Subscriber mobileSubscriber03 = new MobileSubscription(economist);
        Subscriber physicalSubscriber03 = new PhysicalSubscription(economist);
        Subscriber onlineSubscriber04 = new OnlineSubscription(economist);
        Subscriber mobileSubscriber04 = new MobileSubscription(economist);
        Subscriber physicalSubscriber04 = new PhysicalSubscription(economist);
        Subscriber onlineSubscriber05 = new OnlineSubscription(economist);
        Subscriber mobileSubscriber05 = new MobileSubscription(economist);
        Subscriber physicalSubscriber05 = new PhysicalSubscription(economist);
        for (int i = 0; i < 15; i++) {
            economist.onEvent(new Event());
            try {
                int waitTime = 3000;
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Event {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    Event() {
        Date date = new Date();
        System.out.println("\nA new set of reviews for the subscribers of magazines at: " + new Timestamp(date.getTime()));
    }
}

class Economist {
    private Set<Subscriber> subscribers = new HashSet<>();

    void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    void onEvent(Event ev) {
        for (Subscriber ob : subscribers) {
            ob.notify(ev);
        }
    }
}

interface Subscriber {
    void notify(Event ev);
}

class SubscriberRating {
    int getRand() {
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
}

class OnlineSubscription implements Subscriber {
    OnlineSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Event ev) {
        SubscriberRating subscriberRating = new SubscriberRating();
        System.out.println(OnlineSubscription.class.getName() + " of the Economist gives a rating: " + subscriberRating.getRand());
    }
}

class PhysicalSubscription implements Subscriber {
    PhysicalSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Event ev) {
        SubscriberRating subscriberRating = new SubscriberRating();
        System.out.println(PhysicalSubscription.class.getName() + " of the Economist gives a rating: " + subscriberRating.getRand());
    }
}

class MobileSubscription implements Subscriber {
    MobileSubscription(Economist economist) {
        economist.register(this);
    }

    @Override
    public void notify(final Event ev) {
        SubscriberRating subscriberRating = new SubscriberRating();
        System.out.println(MobileSubscription.class.getName() + " of the Economist gives a rating: " + subscriberRating.getRand());
    }
}