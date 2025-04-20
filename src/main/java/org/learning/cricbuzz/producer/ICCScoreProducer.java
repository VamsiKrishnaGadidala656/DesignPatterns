package org.learning.cricbuzz.producer;

import org.learning.cricbuzz.models.Match;
import org.learning.cricbuzz.subsricbers.ScoreBoardSubscriber;
import org.learning.cricbuzz.subsricbers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ICCScoreProducer implements Producer{

    private Match match;
    private List<Subscriber> subscribers;


    public ICCScoreProducer(Match match) {
        this.match = match;
        this.subscribers = new ArrayList<>();
    }

    public void scoreUpdated(String currentOver, String currentBall, String wickets, String currentScore, boolean isFirstInnings) {

        //we will call that icc api layer to fetch the data
        this.notifySubscribers();
    }

    public Match getMatchData() {
        return match;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {

        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }

    }
}
