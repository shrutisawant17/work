
package LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Clerk extends Staff
{

    int deskNo, ClerkID;
    int id1, ph1;
    String n1, a1;
    public static int currentdeskNumber = 1;
    public static int newClerkID = 1;

    public Clerk(int id, String n, String a, int ph, double s, int dk)
    {
        super(id, n, a, ph, s);
        if (dk == -1)
        {
            ClerkID = newClerkID;
            deskNo = currentdeskNumber;
        } else
        {
            ClerkID = newClerkID;
            deskNo = dk;
        }

        newClerkID++;
        currentdeskNumber++;
    }

    @Override
    public void getData()
    {
        try
        {
            super.getData();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");

            Statement st = con.createStatement();

            String stmt = String.format("Insert INTO lms.Clerk (C_ID,DESK_NO) Values (%d,%d)", ClerkID, deskNo);

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
        System.out.println("Desk Number: " + deskNo);
    }

}