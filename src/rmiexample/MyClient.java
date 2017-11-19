/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexample;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.*;

/**
 *
 * @author mark
 */
public class MyClient {

    public static void main(String[] args) throws Exception {

        Registry reg = LocateRegistry.getRegistry("192.168.1.95", 4679);
        MyRemoteInterface handle
                = (MyRemoteInterface) reg.lookup("myrmiserver");

        while (true) {
            BufferedReader in
                    = new BufferedReader(new InputStreamReader(System.in));

            String message = in.readLine();

            handle.printMessage(message);
        }

    }
}
