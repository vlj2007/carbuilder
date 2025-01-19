
// Конкретный строитель
public class SportCarBuilder implements CarBuilder{
    private Car car;

    public SportCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void buildEngine(){
        car.setEngine("V8 Engine");
    }

    @Override
    public void buildWheels(){
        car.setEngine("Spot Wheels");
    }

    @Override
    public void buildColor(){
        car.setEngine("Red");
    }

    @Override
    public Car getCar(){
        return car;
    }


}
