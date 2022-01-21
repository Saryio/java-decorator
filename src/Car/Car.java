package Car;

public abstract class Car {
    public String description;

    public String getDescription(){
        return this.description;
    }

    public abstract Float cost();
}
