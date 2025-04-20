package org.learning.cricbuzz.producer;

import org.learning.cricbuzz.models.Match;
import org.learning.cricbuzz.subsricbers.Subscriber;

public interface Producer {

    Match getMatchData();

    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers();
}
