package LMS;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Borrower extends Person
{
    private ArrayList<LateFees> borrowedBooks;
    private ArrayList<HoldRequest> onHoldBooks;
    private static int newB_ID = 1;
    int B_ID;

    public Borrower(int id, String n, String a, int p)
    {
        super(id, n, a, p);

        borrowedBooks = new ArrayList();
        onHoldBooks = new ArrayList();
        B_ID = newB_ID;
        newB_ID++;
    }

    @Override
    public void getData()
    {
        try
        {
            super.getData();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");

            Statement st = con.createStatement();

            String stmt = String.format("Insert INTO lms.Borrower (B_ID) Values (%d)", B_ID);

            // System.out.println(stmt);
            st.execute(stmt);
            con.close();
        } catch (Exception ex)
        {
            ex.getMessage();
        }
    }

    @Override
    public void printInfo()
    {
        super.printInfo();

        printBorrowedBooks();
        printOnHoldBooks();
    }

    public void printBorrowedBooks()
    {
        if (!borrowedBooks.isEmpty())
        {
            System.out.println("\nBorrowed Books are: ");

            System.out.println("------------------------------------------------------------------------------");
            System.out.println("No.\t\tTitle\t\t\tAuthor\t\t\tSubject");
            System.out.println("------------------------------------------------------------------------------");

            for (int i = 0; i < borrowedBooks.size(); i++)
            {
                System.out.print(i + "-" + "\t\t");
                borrowedBooks.get(i).getBook().printInfo();
                System.out.print("\n");
            }
        } else
            System.out.println("\nNo borrowed books.");
    }

    public void printOnHoldBooks()
    {
        if (!onHoldBooks.isEmpty())
        {
            System.out.println("\nOn Hold Books are: ");

            System.out.println("------------------------------------------------------------------------------");
            System.out.println("No.\t\tTitle\t\t\tAuthor\t\t\tSubject");
            System.out.println("------------------------------------------------------------------------------");

            for (int i = 0; i < onHoldBooks.size(); i++)
            {
                System.out.print(i + "-" + "\t\t");
                onHoldBooks.get(i).getBook().printInfo();
                System.out.print("\n");
            }
        } else
            System.out.println("\nNo On Hold books.");
    }

    public void updateBorrowerInfo() throws IOException
    {
        String choice;

        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nDo you want to update " + getName() + "'s Name ? (y/n)");
        choice = sc.next();

        if (choice.equals("y"))
        {
            System.out.println("\nType New Name: ");
            setName(reader.readLine());
            System.out.println("\nThe name is successfully updated.");
        }

        System.out.println("\nDo you want to update " + getName() + "'s Address ? (y/n)");
        choice = sc.next();

        if (choice.equals("y"))
        {
            System.out.println("\nType New Address: ");
            setAddress(reader.readLine());
            System.out.println("\nThe address is successfully updated.");
        }

        System.out.println("\nDo you want to update " + getName() + "'s Phone Number ? (y/n)");
        choice = sc.next();

        if (choice.equals("y"))
        {
            System.out.println("\nType New Phone Number: ");
            setPhone(sc.nextInt());
            System.out.println("\nThe phone number is successfully updated.");
        }

        System.out.println("\nBorrower is successfully updated.");

    }

    public void addBorrowedBook(LateFees iBook)
    {
        borrowedBooks.add(iBook);
    }

    public void removeBorrowedBook(LateFees iBook)
    {
        borrowedBooks.remove(iBook);
    }

    public void addHoldRequest(HoldRequest hr)
    {
        onHoldBooks.add(hr);
    }

    public void removeHoldRequest(HoldRequest hr)
    {
        onHoldBooks.remove(hr);
    }

    public ArrayList<LateFees> getBorrowedBooks()
    {
        return borrowedBooks;
    }

    public ArrayList<HoldRequest> getOnHoldBooks()
    {
        return onHoldBooks;
    }

}
