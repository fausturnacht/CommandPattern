package commandPattern;


public class Television implements PowerSwitchable, Incrementable, Decrementable, ContinuousControl {

    //Switch
    public String switchOn() {
        return "TV is switched-on!";
    }

    public String switchOff(){
        return "TV is switched-off.";
    }

    //Rigid Controls

    public String increment() {
        return "TV channel selector is incremented";
    }

    public String decrement(){
        return "TV channel selector is decremented";
    }

    //Continuous Controls
    public String setContValue(int value) {
        return "TV's volume is set to "+value + ".";
    }
}
