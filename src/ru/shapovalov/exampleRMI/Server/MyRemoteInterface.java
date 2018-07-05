package ru.shapovalov.exampleRMI.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {

    Integer getIncratedNumber(Integer number) throws RemoteException;
}
