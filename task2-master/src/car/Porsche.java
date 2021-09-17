package car;

public class Porsche extends Car {

    private double battery;
    private double km_on_recharge;
    private double km_for_full_charge;

    public Porsche(String model, int year, String motor, double battery, double km_on_recharge, double km_for_full_charge) {
        super(model, year, motor);
        this.battery = battery;
        this.km_on_recharge = km_on_recharge;
        this.km_for_full_charge = km_for_full_charge;
    }

    public Porsche(String model, int year, double battery, double km_on_recharge, double km_for_full_charge) {
        super(model, year);
        this.battery = battery;
        this.km_on_recharge = km_on_recharge;
        this.km_for_full_charge = km_for_full_charge;
    }

    public Porsche(String model, int year) {
        super(model, year);
    }

    public Porsche(String model, double battery) {
        super(model);
        this.battery = battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public double getBattery() {
        return battery;
    }

    public double getKm_on_recharge() {
        return km_on_recharge;
    }

    public void setKm_on_recharge(double km_on_recharge) {
        this.km_on_recharge = km_on_recharge;
    }

    public double getKm_for_full_charge() {
        return km_for_full_charge;
    }

    public void setKm_for_full_charge(double km_for_full_charge) {
        this.km_for_full_charge = km_for_full_charge;
    }

    @Override
    public double km_left(){
        return (km_on_recharge*battery)/km_for_full_charge;
    }


    @Override
    public String getFuelType() {
        return "electric";
    }
}
