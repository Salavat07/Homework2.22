public class Mercedes extends Cars implements Printable {

    private String drift;

    public String getDrift() {
        return drift;
    }

    public Mercedes(long speed, int weight, String drift) {
        super(speed, weight);
        this.drift = drift;
    }

    @Override
    public void print() {
        System.out.println(getSpeed() + " " + getWeight() +  " " + getDrift());
    }
}
