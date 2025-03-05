package Exercise2;

public class Temp{
    private final byte size = 5;
    private float[] temps;
    private byte contTemps = 0;
    StringBuilder stringTemps;

    public Temp(){
        temps = new float[size];
    }

    @Override
    public String toString(){
        stringTemps = new StringBuilder();
        stringTemps.append("[");

        for(float temp : temps){
            stringTemps.append(temp);
            stringTemps.append(", ");
        }
        stringTemps.append("]");
        return stringTemps.toString();
    }

    public float[] getTemps() {
        return temps;
    }

    public byte getContTemps() {
        return contTemps;
    }

    public byte getSize() {
        return size;
    }

    public void setTemps(float[] temps) {
        this.temps = temps;
    }

    public String showTemps(){
        return temps[0] == 0 ? "No has ingresado temperaturas" : toString() ;
    }
    public float promedyTemps(){
        float promedy = 0;
        for(int i = 0; i < size; i++){ promedy += temps[i]; }

        return promedy /= size;
    }

    public String searchTemp(float temp){
        for(int i = 0; i < size; i++) {
            if(temps[i] == temp){
                    return "Temperatura encontrada: " + temps[i];
            }
        }
        return "Tempertatura no encontrada";
    }

    public String tempLargest(){
        stringTemps = new StringBuilder();
        stringTemps.append("[ ");
        byte contTemps = 0;
        for(int i = 0; i < size; i++){
            if(temps[i] > 15.0){
                contTemps++;
                stringTemps.append(temps[i]);
                stringTemps.append(", ");
            }
        }
        stringTemps.append("]");
        return stringTemps.length() > 3 ? stringTemps.toString() + " en total son " + contTemps + " temperaturas" : "No existe temperaturas mayores a 15.0" ;
    }

}
