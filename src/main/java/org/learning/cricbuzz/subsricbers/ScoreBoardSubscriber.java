package org.learning.cricbuzz.subsricbers;

import org.learning.cricbuzz.models.Innings;
import org.learning.cricbuzz.models.Match;
import org.learning.cricbuzz.producer.Producer;

import java.util.List;

public class ScoreBoardSubscriber implements Subscriber {

    private Match match;

    private List<Producer> producers;
    public ScoreBoardSubscriber(Match match, List<Producer> producers) {
        this.match = match;
        this.producers = producers;

        for (Producer producer : producers) {
            producer.subscribe(this);
        }
    }

    public void update(Producer producer) {

        boolean isFirstInnings = producer.getMatchData().isFirstInnings();
        Innings inningsProducer = (isFirstInnings)? producer.getMatchData().getInnings1() : producer.getMatchData().getInnings2();

        Innings inningsSubscriber = (isFirstInnings)? match.getInnings1() : match.getInnings2();

        inningsSubscriber.setCurrentOver(inningsProducer.getCurrentOver());
        inningsSubscriber.setCurrentBall(inningsProducer.getCurrentBall());
        inningsSubscriber.setWickets(inningsProducer.getWickets());
        inningsSubscriber.setCurrentScore(inningsProducer.getCurrentScore());
    }
}
