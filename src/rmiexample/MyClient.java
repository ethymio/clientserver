/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexample;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author mark
 */
public class MyClient {

    public static void main(String[] args) throws Exception {

        Registry reg = LocateRegistry.getRegistry("192.168.1.95", 1234);
        MyRemoteInterface handle
                = (MyRemoteInterface) reg.lookup("myrmiserver");

        handle.printMessage("Wassup!");
    }
}
