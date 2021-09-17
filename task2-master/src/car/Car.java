package car;

public abstract class Car {

    private String model;
    private int year;
    private String motor;
    private static int countCars = 0;

    public Car(String model, int year, String motor) {
        this.model = model;
        this.year = year;
        this.motor = motor;
        countCars ++;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        countCars ++;
    }

    public Car(int year) {
        this.year = year;
        countCars ++;
    }

    public Car(String model) {
        this.model = model;
        countCars ++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getCountCars() {
        return countCars;
    }

    public abstract String getFuelType();

    public abstract double km_left();
}