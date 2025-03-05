import java.util.ArrayList;

public class ArrayListt{
    
    private ArrayList<Integer> numbers = new ArrayList<>();

    public boolean addNumber(int number){
        numbers.add(number);
        return true;
    }

    public int showSum(){
        int sum = 0; 

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    public float promedyNumbers(){
        float promedy = 0;

        if(numbers.size() == 0) {
            return 0; 
        }

        for(int number : numbers){
            promedy += number;
        }
        return promedy /= numbers.size();
    }

    public String listNumbers(){
        String list = "";

        for(int number : numbers){
            list += number + ", ";
        } 
        
        return list;
    }
}
