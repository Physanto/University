import java.util.ArrayList;

public class SearchLinear{

    public static void list(Object[] list){
        for(Object n : list){
            System.out.println(n);
        }
    }

    public static int searchLinear(Object[] array, Object value){

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public static Object searchLinear(Object[][] array, Object value){

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals(value)){
                    SearchLinear searchLinear = new SearchLinear();
                    SearchLinear.Position position = searchLinear.new Position(i, j);
                    return position.getPosition();
                }     
            } 
        }
        return -1;
    }
    
    public static Object searchLinear(Object[][][] array, Object value){

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    if(array[i][j][k].equals(value)){
                        SearchLinear searchLinear = new SearchLinear();
                        SearchLinear.Position position = searchLinear.new Position(i,j,k);
                        return position.getPosition();
                    } 
                }     
            } 
        }
        return -1;
    }
    
    public static <T> Object searchLinear(ArrayList<T> array, Object value){
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i).equals(value)){
                return i;
            }     
        }
        return -1;
    }

    class Position{
        private int i;
        private int j;
        private int k;

        public Position(int i, int j){
            this.i = i;
            this.j = j;
        }

        public Position(int i, int j, int k){
            this.i = i;
            this.j = j;
            this.k = k;
        }

        public Object getPosition(){
            return new Position(i,j,k);
        }
        
        @Override
        public String toString(){
            return "[" + i + "]" + "[" + j + "]";
        }
    }
}
