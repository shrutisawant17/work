
package LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Librarian extends Staff
{

    int officeNo, L_ID ;
    public static int currentOfficeNumber = 0;
  private static int lid = 1;
    public Librarian(int id, String n, String a, int p, double s, int of)
    {
        super(id, n, a, p, s);

        if (of == 1)
            officeNo = currentOfficeNumber;
        else
            officeNo = of;
        L_ID=lid;
        lid++;
        currentOfficeNumber++;
    }

    @Override
    public void getData()
    {
        try
        {
            super.getData();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");

            Statement st = con.createStatement();

            String stmt = String.format("Insert INTO lms.librarian (L_ID,OFFICE_NO) Values (%d,%d)", L_ID, officeNo);

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
        System.out.println("Office Number: " + officeNo);
    }
}
