package codigo;

import java.rmi.RMISecurityManager;

/**
 * Created by Juan Francisco on 03/04/2014.
 */
public class Main {

    public static  void main(String[] args){

        if(System.getSecurityManager() == null){
            System.setSecurityManager(new RMISecurityManager());

        }

        CConsumirRemoto consumir = new CConsumirRemoto();
        consumir.SumarRemotamente(7,8);

    }
}
