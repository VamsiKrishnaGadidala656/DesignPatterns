package org.learning.cricbuzz.subsricbers;

import org.learning.cricbuzz.producer.Producer;

import java.util.ArrayList;
import java.util.List;

public class CommentarySubscriber implements Subscriber{

    private List<String> commentary;
    private List<Producer> producers;

    public CommentarySubscriber(List<Producer> producers) {
        this.producers = producers;
        this.commentary = new ArrayList<>();

        for (Producer producer : producers) {
            producer.subscribe(this);
        }
    }

    @Override
    public void update(Producer producer) {

        this.commentary.add(producer.getMatchData().getCommentary().get(producer.getMatchData().getCommentary().size()-1));
    }
}
