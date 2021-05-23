import java.rmi.*;

public class ClientRMI
{
	 public static void main (String args[])
	 {
		 try
		 {
			 RMI obj=(RMI)
			 Naming.lookup("//localhost/Server_RMI");
			 int num=obj.SubSquare(16,12);
			 System.out.println("The Final Value is : "+num);
		 }
		 catch (Exception e)
		 	 {
		 		 System.out.println(e);
	 		}
 	}
}