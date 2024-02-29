package Events;

import  javafx.event.Event;
import  javafx.event.EventType;

public class StartButtonClicked extends Event {
    public static final EventType<StartButtonClicked> START_BUTTON_CLICKED = new javafx.event.EventType<>(Event.ANY, "START_BUTTON_CLICKED");

    public StartButtonClicked(){
        super(START_BUTTON_CLICKED);
    }

}
