package Exercise1;

import java.util.Date;

public class Lending {
    private Date dateLend;
    private Date dateReturn;
    private Book book;
    private User user;

    public Lending() {}

    public Lending(Date dateLend, Date dateReturn, Book book, User user) {
        this.dateLend = dateLend;
        this.dateReturn = dateReturn;
        this.book = book;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Lending{" +
                "dateLend=" + dateLend +
                ", dateReturn=" + dateReturn +
                '}';
    }

    public Date getDateLend() {
        return dateLend;
    }

    public void setDateLend(Date dateLend) {
        this.dateLend = dateLend;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }
}
