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

public class NumberMultiplicationTask extends UnicastRemoteObject implements INumberMultiplicationTask, Serializable {
    private float a, b;
    private Float result;

 
    public NumberMultiplicationTask(float a, float b) throws RemoteException {
        this.a = a;
        this.b = b;
    }

    public NumberMultiplicationTask() throws RemoteException {
    }

  
    @Override
    public Object executeadd() {
        result = a + b +0f;
        this.result = (Float) result;
        return result;
    }
    
    @Override
    public Object executeminus() {
        result = a - b +0f;
        this.result = (Float) result;
        return result;
    }
    
    @Override
    public Object executedivide() {
        result = a / b+0f;
        this.result = (Float) result;
        return result;
    }
    
    @Override
    public Object execute() {
        result = a * b+0f;
        this.result = (Float) result;
        return result;
    }

    @Override
    public Object getResult() {
        return result;
    }





    @Override
    public INumberMultiplicationTask MultiplyNumber(float x, float y) throws RemoteException {
        // TODO Auto-generated method stub
        return new NumberMultiplicationTask(x,y);
    }
}
