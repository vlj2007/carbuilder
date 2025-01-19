// Клиентский класс
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SportCarBuilder();
        CarDirector director = new CarDirector(builder);
        Car car = director.constructCar();
        System.out.println(car);

    }
}