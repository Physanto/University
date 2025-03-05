public class GestionElectrodomestico{

    private final int row = 2;
    private final int column = 2;

    private Electrodomestico[][] electrodomesticos;

    public GestionElectrodomestico(){
        electrodomesticos = new Electrodomestico[row][column];
    }

    public void agregarElectrodomestico(Electrodomestico[][] electrodomestico){

        for(int i = 0; i < electrodomesticos.length; i++) {
            for(int j = 0; j < electrodomesticos[i].length; j++) { 
                electrodomesticos[i][j] = electrodomestico[i][j];
            }  
        }
    }

    public Electrodomestico[][] listarElectrodomesticos(){
        return electrodomesticos;
    }

    public Electrodomestico buscarElectrodomestico(String electr){

        for(Electrodomestico[] electrodomestico : electrodomesticos){
            for(Electrodomestico electro : electrodomestico){

                if(electro.getNombre().equals(electr)){
                    return electro;
                }
            }
        }
        return null;
    }

    public int getRow(){ return row; }
    public int getColumn(){ return column; }
}
