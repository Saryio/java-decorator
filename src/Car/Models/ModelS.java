package Car.Models;

import Car.Car;

public class ModelS extends Car{

    public String description = "Mc Laren";

    public String getDescription(){
        return this.description;
    }

    @Override
    public Float cost() {
        return (float) 755000;
    }
    
}
