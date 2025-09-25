package commandPattern;

public class AirConditioner implements PowerSwitchable, Incrementable, Decrementable, ContinuousControl {

    //Switch
    public String switchOn() {
        return "AC is switched-on!";
    }

    public String switchOff(){
        return "AC is switched-off.";
    }

    //Rigid Controls

    public String increment() {
        return "AC's current mode is switched to the next one.";
    }

    public String decrement(){
        return "AC's current mode is switched to the previous one.";
    }

    //Continuous Controls
    public String setContValue(int value) {
        return "AC's strength is set to "+value + ".";
    }
}
