import java.util.Scanner;
public class entry extends login_details{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    login_details log=new login_details();
    System.out.println("\n~~~~~~~~~~~\n1. Admin\n2. Faculty");
    int choice=scan.nextInt();
    System.out.println("-------------------------------------------------");
    System.out.println("Enter -1 for go back");
        System.out.println("Enter id");
        int id =scan.nextInt();
        scan.nextLine();
        String pass=null;
        if (id!=-1)
        {
           System.out.println("Enter password");
           pass = scan.nextLine();
        }
        if (id==-1||pass.equals("-1"))
        {
            String[] str={"kamle","saini","aere"};
            entry.main(str);
        }
        login_details obj=new login_details();
        
        try{obj.log_id(id,pass,choice);}
        catch(Exception e)
        {
            System.out.println("Error to open login_details_admin");
        }
        }
  }
