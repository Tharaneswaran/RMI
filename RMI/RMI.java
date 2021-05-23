import java.rmi.*;

public interface RMI extends Remote
{
	int SubSquare(int x,int y) throws RemoteException;
}