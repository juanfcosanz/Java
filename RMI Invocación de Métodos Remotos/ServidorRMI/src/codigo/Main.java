package codigo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Juan Francisco on 03/04/2014.
 */
public class Main {

    public static void main(String[] args) throws RemoteException{

        Registry registro = LocateRegistry.createRegistry(7777);
        registro.rebind("RMIRemoto",new CServidorImpl());


    }
}
