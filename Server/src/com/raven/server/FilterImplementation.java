/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
//This class contains implementation of all the functionalities provided to the client. 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


public class FilterImplementation extends UnicastRemoteObject implements FilterInterface, Serializable{

	protected FilterImplementation(String s) throws RemoteException {
		File storageDir = new File (s);
		storageDir.mkdir();
	}
	
	public void uploadFileToServer(byte[] mydata, String serverpath, int length) throws RemoteException {
			
    	try {
    		File serverpathfile = new File(serverpath);
    		FileOutputStream out=new FileOutputStream(serverpathfile);
    		byte [] data=mydata;
			
    		out.write(data);
			out.flush();
	    	out.close();
	 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	System.out.println("Done writing data...");
		
	}
	
	public byte[] downloadFileFromServer(String serverpath) throws RemoteException {
					
		byte [] mydata;	
		
			File serverpathfile = new File(serverpath);			
			mydata=new byte[(int) serverpathfile.length()];
			FileInputStream in;
			try {
				in = new FileInputStream(serverpathfile);
				try {
					in.read(mydata, 0, mydata.length);
				} catch (IOException e) {
					
					e.printStackTrace();
				}						
				try {
					in.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}		
			
			return mydata;
				 
	}

	
	public String[] listFiles(String serverpath) throws RemoteException {
		File serverpathdir = new File(serverpath);
		return serverpathdir.list();
		
	}
	
	public boolean createDirectory(String serverpath) throws RemoteException {	
		File serverpathdir = new File(serverpath);
		return serverpathdir.mkdir();
		
	}

	public boolean removeDirectoryOrFile(String serverpath) throws RemoteException {
		File serverpathdir = new File(serverpath);
		return serverpathdir.delete();
		
	}

	public void Grayscale(String inpath,String outpath) throws RemoteException {
		BufferedImage img = null;
		File f = null;
		
		try {
			f = new File(inpath);
			img = ImageIO.read(f);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		int width = img.getWidth();
		int height = img.getHeight();
		
		for(int y=0; y<height; y++) {
			for(int x=0; x<width; x++) {
				int p = img.getRGB(x, y);
				
				int a = (p>>24)&0xff;
				int r = (p>>16)&0xff;
				int g = (p>>8)&0xff;
				int b = p&0xff;
				
				int avg = (r+g+b)/3;
				r = 255 - r;
				g = 255 - g;
				b = 255 - b;
				
				p=(a<<24) | (avg<<16) | (avg<<8) | avg;
				
				img.setRGB(x, y, p);
			}
		}
		
		try {
			f=new File(outpath);
			ImageIO.write(img, "jpeg", f);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

	public void Sepia(String inpath,String outpath) throws RemoteException {
		BufferedImage img = null;
		File f = null;
		
		try {
			f = new File(inpath);
			img = ImageIO.read(f);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		int width = img.getWidth();
		int height = img.getHeight();
		
		for(int y=0; y<height; y++) {
			for(int x=0; x<width; x++) {
				int p = img.getRGB(x, y);
				
				int a = (p>>24)&0xff;
				int r = (p>>16)&0xff;
				int g = (p>>8)&0xff;
				int b = p&0xff;
				
				int tr = (int)(0.393*r + 0.769*g + 0.189*b);
				int tg = (int)(0.343*r + 0.689*g + 0.168*b);
				int tb = (int)(0.272*r + 0.534*g + 0.131*b);
				
				
				if(tr>255) {
					r=255;
				}else {
					r=tr;
				}
				
				if(tg>255) {
					g=255;
				}else {
					g=tg;
				}
				
				if(tb>255) {
					b=255;
				}else {
					b=tb;
				}
				
				
				p=(a<<24) | (r<<16) | (g<<8) | b;
				
				img.setRGB(x, y, p);
			}
		}
		
		try {
			f=new File(outpath);
			ImageIO.write(img, "jpeg", f);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

	public void Negative(String inpath,String outpath) throws RemoteException {
		BufferedImage img = null;
		File f = null;
		
		try {
			f = new File(inpath);
			img = ImageIO.read(f);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		int width = img.getWidth();
		int height = img.getHeight();
		
		
		for(int y=0; y<height; y++) {
			for(int x=0; x<width; x++) {
				int p = img.getRGB(x, y);
				
				int a = (p>>24)&0xff;
				int r = (p>>16)&0xff;
				int g = (p>>8)&0xff;
				int b = p&0xff;
				
				
				r = 255 - r;
				g = 255 - g;
				b = 255 - b;
				
				p=(a<<24) | (r<<16) | (g<<8) | b;
				
				img.setRGB(x, y, p);
			}
		}
		
		try {
			f=new File(outpath);
			ImageIO.write(img, "jpeg", f);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

    @Override
    public Object execute() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getResult() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


	
}
