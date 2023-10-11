/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.server;

/**
 *
 * @author PC
 */
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSchedulerImpl implements TaskScheduler {
    private BlockingQueue<Task> taskQueue;
    private Executor executor;
    private TaskScheduler taskScheduler;

    public TaskSchedulerImpl() {
        taskQueue = new LinkedBlockingQueue<>();
        executor = Executors.newFixedThreadPool(10);
        startWorkerThreads();
    }
    
  

    private void startWorkerThreads() {
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Task task = taskQueue.take();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    @Override
    public void submitTask(Task task) throws RemoteException {
        taskQueue.add(task);
    }

    @Override
    public Object getResult(Task task) throws RemoteException {
        return task.getResult();
    }

    @Override
    public void submitTask(INumberMultiplicationTask task) throws RemoteException {
        // TODO Auto-generated method stub
        taskQueue.add(task);
    }

    @Override
    public Object getResult(INumberMultiplicationTask task) throws RemoteException {
        // TODO Auto-generated method stub
        return task.getResult();
    }

    

    public static void main(String[] args) {
    try {
            Registry registry = LocateRegistry.createRegistry(2001);
            ChatServer ch = new ChatServer();
            Naming.rebind("rmi://localhost:2001/remote",ch);
            FilterImplementation imp =  new FilterImplementation("C:\\Users\\PC\\Desktop\\javaui\\java-ui-dashboard-013\\dashboard-013\\src\\com\\raven\\server");
            registry.bind("remoteObject", imp);
            MatrixOperation mo=new MatrixOperation();
            Naming.rebind("rmi://localhost:2001/TaskScheduler2", mo); 
            NumberMultiplicationTask nm = new NumberMultiplicationTask();
            Naming.rebind("rmi://localhost:2001/TaskScheduler", nm);   
            TaskSchedulerImpl taskScheduler = new TaskSchedulerImpl();
            TaskScheduler stub = (TaskScheduler) UnicastRemoteObject.exportObject(taskScheduler, 2001);
            Naming.rebind("rmi://localhost:2001/TaskScheduler1", stub);
            System.out.println("TaskScheduler RMI server ready.");
        } catch (Exception e) {
            System.err.println("TaskScheduler RMI server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}

