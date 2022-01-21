package Car.Options;

import Car.Car;

public class AirConditioner extends CarOptions{
    public Car decoratedCar;

    public AirConditioner(Car car){
        this.decoratedCar = car;
    }

    @Override
    public String getDescription(){
        return this.decoratedCar.getDescription() + ", Air Conditioner";
    }

    @Override
    public Float cost(){
        return this.decoratedCar.cost() + (float) 144 ;
    }
}
