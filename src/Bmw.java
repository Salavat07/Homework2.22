public class Bmw extends Cars implements Printable {

    private String voice;

    public String getVoice() {
        return voice;

    }


    public Bmw (long speed, int weight, String voice) {
        super(speed, weight);
        this.voice = voice;
    }

    @Override
    public void print() {
        System.out.println(getSpeed()+ " " + getVoice() + " " + getWeight());


    }
}
