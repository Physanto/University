
package model;

/**
 *
 * @author initmanfig
 */
public class Coffe implements Calculate{
    private String code;
    private String mark;
    private String type;
    private int cant;
    private double price;

    public Coffe(String code, String mark, String type, int cant, double price) {
        this.code = code;
        this.mark = mark;
        this.type = type;
        this.cant = cant;
        this.price = price;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getmark() {
        return mark;
    }

    public void setmark(String mark) {
        this.mark = mark;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public int getcant() {
        return cant;
    }

    public void setcant(int cant) {
        this.cant = cant;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "code=" + code +
                ", mark='" + mark + '\'' +
                ", type='" + type + '\'' +
                ", cant=" + cant +
                ", price=" + price +
                '}';
    }
	@Override
    public double calculatePrice(){
        return cant * price;
    }
}
