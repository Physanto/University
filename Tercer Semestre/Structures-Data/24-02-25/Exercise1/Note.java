package Exercise1;

public class Note{
    private final int size = 5;
    private float[] notes;
    StringBuilder stringNotes;

    public Note(){
        notes = new float[size];
    }

    @Override
    public String toString(){
        stringNotes = new StringBuilder();
        stringNotes.append("[");
        for(float note : notes){
            stringNotes.append(note);
            stringNotes.append(", ");
        }
        stringNotes.append("]");
        return stringNotes.toString();
    }
    public int getSize() { return size; }

    public float[] getNotes() { return notes; }
    public void setNotes(float[] notes) { this.notes = notes; }

    public String showNotes(){
        return notes[0] == 0 ? "No has ingresado notas" : toString() ;
    }

    public float promedyNotes(){
        float promedy = 0;
        for(int i = 0; i < size; i++){ promedy += notes[i]; }

        return promedy /= size;
    }

    public String notesLargest(){
        stringNotes = new StringBuilder();
        stringNotes.append("[ ");

        for(int i = 0; i < size; i++){
            if(notes[i] > 3.0){
                stringNotes.append(notes[i]);
                stringNotes.append(", ");
            }
        }
        stringNotes.append("]");
        return stringNotes.length() > 3 ? stringNotes.toString() : "No existe notas mayores a 3.0" ;
    }
}
