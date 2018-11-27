public class PizzaOven extends Component{
    private int temperature;
    private String autoTopping;

    public PizzaOven(String make,String model,int temperature, String autoTopping){
        super(make,model);
        this.temperature = temperature;
        this.autoTopping = autoTopping;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public String getAutoTopping(){
        return this.autoTopping;
    }

    public String play(){
        return "The pizza Oven is cooking.";
    }
}
