/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
//This class interfaces directly between the client and the server
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.rmi.*;
import java.rmi.registry.*;
public interface FilterInterface extends Remote,Task {
	
	public void uploadFileToServer(byte[] mybyte, String serverpath, int length) throws RemoteException;
	public byte[] downloadFileFromServer(String servername) throws RemoteException;
	public String[] listFiles(String serverpath) throws RemoteException;
	public boolean createDirectory(String serverpath) throws RemoteException;
	public boolean removeDirectoryOrFile(String serverpath) throws RemoteException;
	public void Grayscale(String intpath, String outpath) throws RemoteException;
	public void Sepia(String intpath, String outpath) throws RemoteException;
	public void Negative(String inpath,String outpath) throws RemoteException;

}
