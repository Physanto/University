package Exercise1;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private int numberUser;
    private ArrayList<Lending> lendings;

    public User(){}

    public User(String name, int numberUser) {
        this.name = name;
        this.numberUser = numberUser;
        this.lendings = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number=" + numberUser +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberUser() {
        return numberUser;
    }

    public void setNumberUser(int number) {
        this.numberUser = number;
    }

    public ArrayList<Lending> getLendings() {
        return lendings;
    }

    public void setLendings(ArrayList<Lending> lendings) {
        this.lendings = lendings;
    }

    public String applyLend(Date dateLend, Date dateReturn, Book book){
        if (!book.isLended()) {
            book.setLended(true);
            lendings.add(new Lending(dateLend, dateReturn, book, this));

            return name  + " presto el libro " + book.getTitle();
        } else {
            return "El libro " + book.getTitle() + " ya está prestado.";
        }
    }
}
