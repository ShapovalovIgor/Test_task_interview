package ru.shapovalov.exampleRMI.Server;

import java.rmi.RemoteException;

public class MyRemoteClass implements MyRemoteInterface {

    @Override
    public Integer getIncratedNumber(Integer number) throws RemoteException {
        return number +1;
    }
}
