public abstract class Component {

    private String make;
    private String model;
    private  int volume;

    public Component(String make,String model){
        this.make = make;
        this.model = model;
        this.volume = 5;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public abstract String play();

}
