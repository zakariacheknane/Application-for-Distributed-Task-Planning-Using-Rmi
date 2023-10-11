/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MatrixOperation extends UnicastRemoteObject implements IMatrixOperation, Serializable {
    private float[][] matrixA;
    private float[][] matrixB;
    private float[][] result;
 
    public MatrixOperation(float[][] matrixA, float[][] matrixB) throws RemoteException {
        this.matrixA=matrixA;
        this.matrixB=matrixB;
    }

    public MatrixOperation() throws RemoteException {
    }

  
    @Override
    public Object executeaddM() {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        result = new float[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }
    
     @Override
    public Object executeMul() {
    int rows = matrixA.length;
    int columns = matrixB[0].length;
    result = new float[rows][columns];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            for(int k=0; k< matrixA[0].length; k++){
                result[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }
    return result;
}

   
    
    
     

    
    
   

    @Override
    public Object getResult() {
        return result;
    }





    @Override
    public IMatrixOperation MatrixOperationS(float[][] matrixA, float[][] matrixB) throws RemoteException {
        // TODO Auto-generated method stub
        return new MatrixOperation(matrixA,matrixB);
    }

    
    /*  }*/

    @Override
    public Object execute() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

