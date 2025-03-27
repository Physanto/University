package Exercise1;

import java.util.Date;

public class Main {

    public static void main(String[] args){

        Book book1 = new Book("The Hobbit", "123456789", "Nose", false);
        Book book2 = new Book("Deep Work", "Julio Verne", "987654321", false);

        User user1 = new User("Juan Pérez", 10);
        TeacherUser teacherUser1 = new TeacherUser("Julio", 20, "Art");

        System.out.println(user1.applyLend(new Date(2025,01,02), new Date(2025,02,05), book1));
        System.out.println(teacherUser1.applyLend(new Date(2025,02,06), new Date(2025,02,20), book2));
        System.out.println(user1.applyLend(new Date(2025,02,06), new Date(2025,02,20), book1));
    }
}
