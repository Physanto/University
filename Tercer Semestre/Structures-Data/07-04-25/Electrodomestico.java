
public class Electrodomestico {

    private int serial;
    private String marca;
    private double precio;

    public Electrodomestico(int serial, String marca, double precio) {
        this.serial = serial;
        this.marca = marca;
        this.precio = precio;
    }

    public int getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "serial : " + serial + ", marca: " + marca + ", precio: " + precio;
    }
    
    
    
    
}
