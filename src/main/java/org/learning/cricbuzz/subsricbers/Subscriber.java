package org.learning.cricbuzz.subsricbers;

import org.learning.cricbuzz.producer.Producer;

public interface Subscriber {

    void update(Producer producer);
}
