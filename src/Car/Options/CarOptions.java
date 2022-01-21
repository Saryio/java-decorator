package Car.Options;

import Car.Car;

public abstract class CarOptions extends Car{
    public Car decoratedCar;
    public abstract String getDescription();
    public abstract Float cost();
}