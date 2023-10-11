/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
import com.raven.form.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface INumberMultiplicationTask extends Remote,Task{
    public INumberMultiplicationTask MultiplyNumber(float x, float y) throws RemoteException;
    Object execute() throws RemoteException;
    Object executeadd() throws RemoteException;
    Object executeminus() throws RemoteException;
    Object executedivide() throws RemoteException;
    Object getResult() throws RemoteException;

}
