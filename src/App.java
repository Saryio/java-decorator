import Car.Car;
import Car.Models.ModelS;
import Car.Models.ModelX;
import Car.Options.AirConditioner;
import Car.Options.AutoPilot;

public class App {
    public static void main(String[] args) throws Exception {

        //Only one model commented
        Car car = new ModelX();
        //Car car = new ModelS();

        //Have fun commenting and uncommenting this instances
        car = new AutoPilot(car);
        car = new AirConditioner(car);

        System.out.println(car.getDescription());
        System.out.println(car.cost());
    }
}
