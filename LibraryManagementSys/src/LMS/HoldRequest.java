package LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class HoldRequest
{
    int REQ_ID;

    Borrower borrower;
    Book book;
    Date requestDate;
    private static int reqId = 1;

    public HoldRequest(Borrower bor, Book b, Date reqDate)
    {

        borrower = bor;
        book = b;
        requestDate = reqDate;
        REQ_ID = reqId;
        reqId++;
    }

    public void getData()
    {
        try
        {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");

            Statement st = con.createStatement();

            String stmt = String.format(
                    "Insert INTO lms.on_hold_book (REQ_ID,BOOK,BORROWER,REQ_DATE) Values (%d,\"%s\",\"%s\",%t)", REQ_ID,
                    borrower.name, book.getTitle(), requestDate);
            System.out.println(stmt);
            st.execute(stmt);
            con.close();
        } catch (Exception ex)
        {
            ex.getMessage();
        }
    }

    public Borrower getBorrower()
    {
        return borrower;
    }

    public Book getBook()
    {
        return book;
    }

    public Date getRequestDate()
    {
        return requestDate;
    }

    public void print()
    {
        System.out.print(book.getTitle() + "\t\t\t\t" + borrower.getName() + "\t\t\t\t" + requestDate + "\n");
    }
}
