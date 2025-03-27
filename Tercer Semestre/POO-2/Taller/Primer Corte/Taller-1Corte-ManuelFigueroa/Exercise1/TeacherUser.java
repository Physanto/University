package Exercise1;

import java.util.Date;

public class TeacherUser extends User{
    private String departament;

    public TeacherUser(){}

    public TeacherUser(String name, int numberUser, String departament) {
        super(name, numberUser);
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "TeacherUser{" +
                "departament='" + departament + '\'' +
                '}';
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String applyLend(Date dateLend, Date datReturn, Book book) {
        if (!book.isLended()) {
            book.setLended(true);
            getLendings().add(new Lending(dateLend, datReturn, book, this));
            return this.getName()  + " presto el libro " + book.getTitle();
        }
        else {
            return "El libro '" + book.getTitle() + " ya está prestado.";
        }
    }
}
