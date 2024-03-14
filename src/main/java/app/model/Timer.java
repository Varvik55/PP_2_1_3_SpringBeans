package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    @Qualifier("timer")
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

}
