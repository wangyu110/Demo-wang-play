package com.yu.Demo1;

 

public class Demo1 extends Thread{
	  public Demo1(String name) {
		super();
		System.out.println(name+"�̣߳��½�״̬");
	} 
      public synchronized void start(){
    	  super.start();
    	  String name=getName();
    	  System.out.println(name+"�̣߳�����״̬");
      }
      @Override
    public void run() {
    	super.run();
    	//�߳�����
    	String name=Thread.currentThread().getName();
    	 for(int i=0; i<10;i++){
    		 System.out.println(name+"�̣߳�����״̬,i="+i);
    		 if(i==5){
    			 System.out.println(name+"�̣߳�����״̬");
    			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		 
    		 }
    	 }
    	 System.out.println(name+"�̣߳�����״̬");
    }
      
      
      
      
      
    }


