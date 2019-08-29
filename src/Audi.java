public class Audi extends Cars implements Printable{

    private double volume;

    public Audi(long speed, int weight,double volume) {
        super(speed, weight);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println(getSpeed() + " " + getVolume() + " " + getWeight());
    }
}
