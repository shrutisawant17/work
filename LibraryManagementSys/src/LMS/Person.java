package LMS;

import java.sql.*;

public abstract class Person extends Exception
{
    protected int id;
    protected String password;
    protected String name;
    protected String address;
    protected int phoneNo;

    static int currentIdNumber = 0;

    public Person(int dd, String n, String a, int p)
    {
        currentIdNumber++;

        if (dd == -1)
        {
            id = currentIdNumber;
        }

        else
        {
            id = dd;

        }

        password = Integer.toString(id);
        name = n;
        address = a;
        phoneNo = p;

    }

    public void getData()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root@123");
            Statement st = con.createStatement();

            String stmt = String.format("Insert INTO lms.person Values (%d,\"%s\",%d, \"%s \", \"%s \")", id, name,
                    phoneNo, address, password);

            // System.out.println(stmt);
            st.execute(stmt);
            con.close();
        } catch (Exception ex)
        {
            ex.getMessage();
        }
    }

    public void printInfo()
    {
        System.out.println("-----------------------------------------");
        System.out.println("\nThe details are: \n");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phoneNo + "\n");
    }

    public void setAddress(String a)
    {
        address = a;
    }

    public void setPhone(int p)
    {
        phoneNo = p;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhoneNumber()
    {
        return phoneNo;
    }

    public int getID()
    {
        return id;
    }

    public static void setIDCount(int n)
    {
        currentIdNumber = n;
    }

}
