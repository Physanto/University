import java.util.ArrayList;

public class ArrayListNames{
    private ArrayList<String> students; 

    public ArrayListNames(){
        students = new ArrayList<>();
    }

    public void addStudent(String student){
        students.add(student);
    }

    public String listStudents(){
        String list = "";
        for(String student : students){
            list += student + ", ";
        }
        return list;
    }

    public String searchEstudent(String student){
        String s = "";
        for (int i = 0; i < students.size(); i++) {    
            if(students.get(i).equals(student)){
                 return "Encontrado en la posicion " + i;
            }
        }
        return "No encontrado";
    }

    public int numbersStudents(){
        return students.size();
    }

    public void editStudent(String student, String change){

        for(int i = 0; i < students.size(); i++){
            if(students.get(i).equals(student)){
                students.set(i, change);
                return;
            }
        }
    }

    public void deleteStudent(String student){
        students.remove(student);
    }    
}
