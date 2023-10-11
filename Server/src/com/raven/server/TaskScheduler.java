/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaskScheduler extends Remote {
    void submitTask(Task task) throws RemoteException;
    Object getResult(Task task) throws RemoteException;
    void submitTask(INumberMultiplicationTask task) throws RemoteException;
    Object getResult(INumberMultiplicationTask task) throws RemoteException;

}
