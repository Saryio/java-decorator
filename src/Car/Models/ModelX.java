package Car.Models;

import Car.Car;

public class ModelX extends Car{

    public String description = "Ferrari";

    public String getDescription(){
        return this.description;
    }

    @Override
    public Float cost(){
        return (float) 902000;
    }
}
