// Inheritance(Parent Class).
class ElectronicAppliance {
    protected String brand;
    protected int powerRating;

    public ElectronicAppliance(String brand, int powerRating){
        this.brand = brand;
        this.powerRating = powerRating;
    }
    public void turnOn(){
        System.out.println(brand+ " treadmill is ON.");
    }
    public void turnOff(){
        System.out.println(brand+ " treadmill is OFF.");
    }
}
