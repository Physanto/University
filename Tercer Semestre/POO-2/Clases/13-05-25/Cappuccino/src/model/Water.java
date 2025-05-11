
package model;

/**
 *
 * @author initmanfig
 */
public class Water {
    private String code;
    private String type;
    private int cant;
    private double price;

    public Water(String code, String type, int cant, double price) {
        this.code = code;
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
        return "Agua{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", cant=" + cant +
                ", price=" + price +
                '}';
    }

    public double calcular(){
        return cant * price;
    }
}
