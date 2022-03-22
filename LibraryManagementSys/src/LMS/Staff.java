package LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Staff extends Person
{
    protected double salary;
    private static int sid = 1;
    int staffID = 1;

    public Staff(int id, String n, String a, int p, double s)
    {
        super(id, n, a, p);

        salary = s;
        staffID = sid;
        sid++;
    }

    @Override
    public void getData()
    {
        try
        {
            super.getData();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");

            Statement st = con.createStatement();

            String stmt = String.format("Insert INTO lms.staff (S_ID,TYPE,SALARY) Values (%d,\"%s \",%.3f)", staffID,
                    "Salary", salary);
            
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
        System.out.println("Salary: " + salary + "\n");
    }

    public double getSalary()
    {
        return salary;
    }
}