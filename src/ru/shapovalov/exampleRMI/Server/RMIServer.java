package ru.shapovalov.exampleRMI.Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

//add java option -Djava.security.policy=.java.policy
public class RMIServer {

    public static void main(String[] args) {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        MyRemoteInterface myRemoteObject = new MyRemoteClass();

        try {
            MyRemoteInterface stub = (MyRemoteInterface) UnicastRemoteObject.exportObject(myRemoteObject, 0);
            Registry registry = LocateRegistry.createRegistry(1099);

            registry.bind("MyRemoteObject", stub);
            System.out.println("bound 'MyRemoteObject'");
        } catch (Throwable e) {
            System.out.println("couldn't bind 'MyRemoteInterface' cause");
        }

    }
}
