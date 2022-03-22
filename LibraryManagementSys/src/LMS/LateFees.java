
package LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class LateFees
{
    int L_ID;

    private Borrower borrower;
    private Book book;

    private Staff issuer;
    private Date issuedDate;

    private Date dateReturned;
    private Staff receiver;

    private boolean finePaid;
    private static int newlid = 1;

    public LateFees(Borrower bor, Book b, Staff i, Staff r, Date iDate, Date rDate, boolean fPaid)
    {
        borrower = bor;
        book = b;
        issuer = i;
        receiver = r;
        issuedDate = iDate;
        dateReturned = rDate;

        finePaid = fPaid;
        newlid = L_ID;
        L_ID++;
    }

    public void getData()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");
            Statement st = con.createStatement();

            String stmt = String.format(
                    "Insert INTO lms.loan(L_ID,BORROWER,BOOK,ISSUER,ISS_DATE,RECEIVER,RET_DATE,FINE_PAID) Values (%d,\"%s\",\"%s\",%d, \"%s \", %d,%t,%b)",
                    borrower, book, issuer, receiver, issuedDate, dateReturned);

            // System.out.println(stmt);
            st.execute(stmt);
            con.close();
        } catch (Exception ex)
        {
            ex.getMessage();
        }
    }

    public Book getBook()
    {
        return book;
    }

    public Staff getIssuer()
    {
        return issuer;
    }

    public Staff getReceiver()
    {
        return receiver;
    }

    public Date getIssuedDate()
    {
        return issuedDate;
    }

    public Date getReturnDate()
    {
        return dateReturned;
    }

    public Borrower getBorrower()
    {
        return borrower;
    }

    public boolean getFineStatus()
    {
        return finePaid;
    }

    public void setReturnedDate(Date dReturned)
    {
        dateReturned = dReturned;
    }

    public void setFineStatus(boolean fStatus)
    {
        finePaid = fStatus;
    }

    public void setReceiver(Staff r)
    {
        receiver = r;
    }

    public double computeFine1()
    {
        double totalFine = 0;

        if (!finePaid)
        {
            Date iDate = issuedDate;
            Date rDate = new Date();

            long days = ChronoUnit.DAYS.between(rDate.toInstant(), iDate.toInstant());
            days = 0 - days;

            days = days - Library.getInstance().book_return_deadline;

            if (days > 0)
                totalFine = days * Library.getInstance().per_day_fine;
            else
                totalFine = 0;
        }
        return totalFine;
    }

    public void payFine()
    {

        double totalFine = computeFine1();

        if (totalFine > 0)
        {
            System.out.println("\nTotal Fine generated: Rs " + totalFine);

            System.out.println("Do you want to pay? (y/n)");

            Scanner input = new Scanner(System.in);

            String choice = input.next();

            if (choice.equals("y") || choice.equals("Y"))
                finePaid = true;

            if (choice.equals("n") || choice.equals("N"))
                finePaid = false;
        } else
        {
            System.out.println("\nNo fine is generated.");
            finePaid = true;
        }
    }

    public void renewIssuedBook(Date iDate)
    {
        issuedDate = iDate;

        System.out.println("\nThe deadline of the book " + getBook().getTitle() + " has been extended.");
        System.out.println("Issued Book is successfully renewed!\n");
    }
}