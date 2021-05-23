import java.rmi.*;
import java.rmi.server.*;
public class ServerRMI extends UnicastRemoteObject implements RMI
{
	public ServerRMI() throws RemoteException
	    {
	        super();
         }
     public int SubSquare(int x,int y) throws RemoteException {return (x*x)-(y*y);}

 public static void main (String args[])
 {
	 try
	 {
		 ServerRMI RemoteServer= new ServerRMI();
		 Naming.rebind("Server_RMI",RemoteServer);
		 System.out.println("System is Ready!!!");
	 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
 }
}
