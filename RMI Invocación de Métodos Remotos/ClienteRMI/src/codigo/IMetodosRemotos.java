package codigo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Juan Francisco on 03/04/2014.
 */
public interface IMetodosRemotos extends Remote {

    public int SumaRemota(int a, int b) throws RemoteException;
}
