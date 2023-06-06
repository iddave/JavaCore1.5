package net.georgihugaev.patterns.behaivor.ObserverPattern;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> messages);
}
