package creational.prototype;

public class Vehicle implements Cloneable {
    private String model;
    private Engine engine;

    public Vehicle(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void showDetails() {
        System.out.println("Model: " + model + ", Engine Type: " + engine.getType());
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //only-shallow-cloning:
        Vehicle clonedVehicle = (Vehicle) super.clone();
        //deep-cloning:
        clonedVehicle.engine = (Engine) this.engine.clone();
        return clonedVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
