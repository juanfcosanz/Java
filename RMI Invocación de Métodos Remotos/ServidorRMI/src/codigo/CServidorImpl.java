package codigo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Juan Francisco on 03/04/2014.
 */
public class CServidorImpl extends UnicastRemoteObject implements IMetodosRemotos {

    protected CServidorImpl() throws RemoteException {}

    @Override
    public int SumaRemota(int a, int b) throws RemoteException {
        return a + b;
    }
}
