import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class continent 
{
    String con;
    InputStreamReader i = new InputStreamReader(System.in);
    BufferedReader r = new BufferedReader(i);
    void con_input() throws IOException
    {
        System.out.println("Enter Continent Name:");
        con = r.readLine();
    }
}

class Country extends continent
{
    String cou;
    void cou_input() throws IOException
    {
        System.out.println("Enter Country Name:");
        cou = r.readLine();
    }
}

class State extends Country
{
    String sta;
    void sta_input() throws IOException
    {
        System.out.println("Enter State Name:");
        sta = r.readLine();
    }
}

class conti extends State
{
    String pla;
    void pla_input() throws IOException
    {
        System.out.println("Enter the Place Name:");
        pla = r.readLine();
    }
}

public class MultilevelInheritance
{
    public static void main(String args[]) throws Exception
    {
        conti s = new conti();

        s.con_input();
        s.cou_input();
        s.sta_input();
        s.pla_input();

        System.out.println("\n Continent :"+s.con);
        System.out.println("\n Country:"+s.cou);
        System.out.println("\n State:"+s.sta);
        System.out.println("\n Place:"+s.pla);
    }
}