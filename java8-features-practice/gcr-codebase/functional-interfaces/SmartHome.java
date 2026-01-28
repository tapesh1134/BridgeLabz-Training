
interface SmartDevice {

    void turnOff();

    void turnOn();
}

class Bulb implements SmartDevice {

    @Override
    public void turnOff() {
        System.out.println("Bulb turned Off");
    }

    @Override
    public void turnOn() {
        System.out.println("Bulb turned On");
    }
}

class AC implements SmartDevice {

    @Override
    public void turnOff() {
        System.out.println("AC turned Off");
    }

    @Override
    public void turnOn() {
        System.out.println("AC turned On");
    }
}

class TV implements SmartDevice {

    @Override
    public void turnOff() {
        System.out.println("TV turned On");
    }

    @Override
    public void turnOn() {
        System.out.println("TV turned Off");
    }
}

public class SmartHome {

    public static void main(String[] args) {
        SmartDevice buld = new Bulb();
        SmartDevice tv = new TV();
        SmartDevice ac = new AC();

        buld.turnOff();
        buld.turnOn();
        tv.turnOff();
        tv.turnOn();
        ac.turnOff();
        ac.turnOn();
    }
}
