package car;

public class Ford extends Car{

    private double tank;
    private double km_on_refill;
    private double km_for_ful_tank;

    public Ford(String model, int year, String motor, double tank , double km_for_ful_tank, double km_on_refill) {
        super(model, year, motor);
        this.tank = tank;
        this.km_for_ful_tank = km_for_ful_tank;
        this.km_on_refill = km_on_refill;
    }

    public Ford(String model, int year, double tank, double km_on_refill, double km_for_ful_tank) {
        super(model, year);
        this.tank = tank;
        this.km_on_refill = km_on_refill;
        this.km_for_ful_tank = km_for_ful_tank;
    }

    public Ford(String model, int year, double tank) {
        super(model, year);
        this.tank = tank;
    }

    public Ford(String model, double km_on_refill) {
        super(model);
        this.km_on_refill = km_on_refill;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public void setKm_on_refill(double km_on_refill) {
        this.km_on_refill = km_on_refill;
    }

    public void setKm_for_ful_tank(double km_for_ful_tank) {
        this.km_for_ful_tank = km_for_ful_tank;
    }

    public double getTank() {
        return tank;
    }

    public double getKm_on_refill() {
        return km_on_refill;
    }

    public double getKm_for_ful_tank() {
        return km_for_ful_tank;
    }
    @Override
    public double km_left(){
        return (km_on_refill*tank)/km_for_ful_tank;
    }
    @Override
    public String getFuelType() {
        return "petrol";
    }
}
