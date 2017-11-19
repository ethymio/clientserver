/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexample;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import rmiexample.MyRemoteInterface;

/**
 *
 * @author mark
 */
public class MyServer extends UnicastRemoteObject implements MyRemoteInterface {

    public void printMessage(String message) throws RemoteException {
        System.out.println(message);
    }

    public static void main(String args[]) throws Exception {

        MyServer server = new MyServer();

        Registry reg = LocateRegistry.createRegistry(4679);
        reg.bind("rmiserver1", server);
    }

    public MyServer() throws RemoteException {

    }
}
