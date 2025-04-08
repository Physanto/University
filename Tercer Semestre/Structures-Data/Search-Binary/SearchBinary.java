public class SearchBinary{
    
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        if(searchBinary(array, 5)){
            System.out.println("Encontrado");
        }
        if(searchBinary(array, 1)){
            System.out.println("Encontrado");
        }
        if(searchBinary(array, 10)){
            System.out.println("Encontrado");
        }
        if(searchBinary(array, 11)){
            System.out.println("Encontrado");
        }
        if(searchBinary(array, 8)){
            System.out.println("Encontrado");
        }
        if(searchBinary(array, 6)){
            System.out.println("Encontrado");
        }
    }

    public static boolean searchBinary(int[] array, int value){ 
        int iRight = array.length - 1;
        int iLeft = 0;

        do{  
            int iMedium = (iLeft + iRight) / 2;

            if(iLeft > iRight){
                return false;
            }
            else if(array[iMedium] == value){
                return true;
            }
            else if(array[iMedium] < value){
                iLeft = iMedium + 1;
            }
            else{
                iRight = iMedium - 1;
            } 
        }
        while(true);
    }
}
