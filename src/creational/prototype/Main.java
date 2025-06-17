package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine petrolEngine = new Engine("Petrol");
        Vehicle originalCar = new Vehicle("Sedan", petrolEngine);

        Vehicle clonedCar = (Vehicle) originalCar.clone();
        clonedCar.setModel("SUV");
        clonedCar.getEngine().setType("CNG");

        System.out.println("Original Car");
        System.out.println(originalCar);

        System.out.println("Cloned Car");
        System.out.println(clonedCar);

    }
}
