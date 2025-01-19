// Директор, который управляет процессом строительства
public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder){
        this.builder = builder;
    }

    public Car constructCar(){
        builder.buildEngine();
        builder.buildWheels();
        builder.buildColor();
        return builder.getCar();
    }

}
