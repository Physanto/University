import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        ArrayList<String> array = new ArrayList<>();
        array.add("manuel");
        array.add("palta");

        String[][] n = {
                        {"1", "2", "3",},
                        {"4", "5", "6"},
        };
        
        Integer[] m = {1,2,4,5,6,7,8,9,0};

        System.out.println("Elemento en: " + SearchLinear.searchLinear(array, "palta"));
    }
}
