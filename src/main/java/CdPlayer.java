public class CdPlayer extends Component{
    private int cdNumber;

    public CdPlayer(String make,String model,int cdNumber){
        super(make,model);
        this.cdNumber = cdNumber;
    }

    public int getCdNumber(){
        return this.cdNumber;
    }

    public String play(){
        return "The cdPlayer is playing.";
    }
}
