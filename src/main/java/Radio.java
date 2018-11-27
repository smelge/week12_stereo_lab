public class Radio extends Component{

    String station;

    public Radio(String make,String model,String station){
        super(make,model);
        this.station = station;
    }



    public String tune(){
        return "You are listening to " + this.station;
    }

    public String play(){
        return "The radio is playing.";
    }
}
