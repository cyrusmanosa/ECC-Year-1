package J2Kad03;

public class Profile {
    private String name;
    private double height;
    private double weight;
    public Profile(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        if( height < 120 ){
            return 170;
        }else{
            return height;
        }
    }

    public double getWeight(){
        if ( weight > 100 ){
            return 50;
        }else{
            return weight;
        }
    }
}
