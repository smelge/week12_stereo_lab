public class RecordPlayer extends Component {
    private int speed;
    private boolean reverse;

    public RecordPlayer(String make,String model,int speed,boolean reverse){
        super(make,model);
        this.speed = speed;
        this.reverse = reverse;
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean isReverse(){
        return this.reverse;
    }

    public String play(){
        return "The RecordPlayer is playing.";
    }
}
