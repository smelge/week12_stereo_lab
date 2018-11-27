public class CassettePlayer extends Component{
    private int cassetteSides;
    private int changePitch;

    public CassettePlayer(String make,String model,int cassetteSides,int changePitch){
        super(make,model);
        this.cassetteSides = cassetteSides;
        this.changePitch = changePitch;
    }

    public int getCassetteSides(){
        return this.cassetteSides;
    }

    public int getChangePitch(){
        return this.changePitch;
    }

    public String play(){
        return "The cassette player is playing.";
    }
}
