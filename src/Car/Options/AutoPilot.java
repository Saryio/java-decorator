package Car.Options;

import Car.Car;

public class AutoPilot extends CarOptions{

    public Car decoratedCar;

    public AutoPilot(Car car){
        this.decoratedCar = car;
    }

    @Override
    public String getDescription() {
        return this.decoratedCar.getDescription() + ", Auto Pilot" ;
    }

    @Override
    public Float cost() {
        return this.decoratedCar.cost() + (float) 244;
    }
    
}
