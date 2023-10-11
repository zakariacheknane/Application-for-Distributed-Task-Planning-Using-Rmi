/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Task extends Remote, Serializable {
    Object execute() throws RemoteException;
    Object getResult() throws RemoteException;
}
