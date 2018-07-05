package ru.shapovalov.exampleRMI.Client;

import ru.shapovalov.exampleRMI.Server.MyRemoteInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//add java option -Djava.security.policy=.java.policy
public class RMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        if(System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

            Registry registry = LocateRegistry.getRegistry("127.0.0.1");
            MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("MyRemoteObject");

            System.out.println("Increated number: " + stub.getIncratedNumber(1));
    }
}
