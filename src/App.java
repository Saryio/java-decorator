import Car.Car;
import Car.Models.ModelS;
import Car.Models.ModelX;
import Car.Options.AirConditioner;
import Car.Options.AutoPilot;

public class App {
    public static void main(String[] args) throws Exception {

        //Deixe só um modelo descomentado
        Car car = new ModelX();
        //Car car = new ModelS();

        //Brinque comentando e descomentando essas instâncias
        car = new AutoPilot(car);
        car = new AirConditioner(car);

        System.out.println(car.getDescription());
        System.out.println(car.cost());
    }
}
