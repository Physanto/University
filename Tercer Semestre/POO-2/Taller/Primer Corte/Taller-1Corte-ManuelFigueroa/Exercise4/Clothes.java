package Exercise4;

public class Clothes extends Product{
    private String season;

    public Clothes(){}

    public Clothes(String name, double price, String season) {
        super(name, price);
        this.season = season;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                super.toString() +
                "season='" + season + '\'' +
                '}';
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public double calculateDiscount(){
        if(season.equals("verano")){
            return getPrice() * 10 / 100;
        }
        else if(season.equals("invierno")){
            return getPrice() * 40 / 100;
        }
        else{
            return 0;
        }
    }
}
