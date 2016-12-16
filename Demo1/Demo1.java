package com.yu.Demo1;

 

public class Demo1 extends Thread{
	  public Demo1(String name) {
		super();
		System.out.println(name+"线程：新建状态");
	} 
      public synchronized void start(){
    	  super.start();
    	  String name=getName();
    	  System.out.println(name+"线程：就绪状态");
      }
      @Override
    public void run() {
    	super.run();
    	//线程名字
    	String name=Thread.currentThread().getName();
    	 for(int i=0; i<10;i++){
    		 System.out.println(name+"线程：运行状态,i="+i);
    		 if(i==5){
    			 System.out.println(name+"线程：阻塞状态");
    			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		 
    		 }
    	 }
    	 System.out.println(name+"线程：死亡状态");
    }
      
      
      
      
      
    }


