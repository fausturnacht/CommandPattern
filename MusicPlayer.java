package commandPattern;

public class MusicPlayer implements PowerSwitchable, Incrementable, Decrementable, ContinuousControl {
    public String switchOn() {
        return "Music Player is switched-on!";
    }

    public String switchOff(){
        return "Music Player is switched-off.";
    }

    public String increment() {
        return "Music Player's next song is now playing.";
    }

    public String decrement(){
        return "Music Player's previous song is now playing.";
    }

    //Continuous Controls
    public String setContValue(int value) {
        return "Music Player's volume is set to "+value + ".";
    }
}
