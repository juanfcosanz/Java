package codigo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Juan Francisco on 03/04/2014.
 */
public class CConsumirRemoto {

    public void SumarRemotamente(int a, int b){

        try {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",7777);
            IMetodosRemotos miIntefaz = (IMetodosRemotos) registro.lookup("RMIRemoto");
            int suma = miIntefaz.SumaRemota(a, b);
            System.out.print("La suma es: "+suma);


        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
