package com.yu.Demo1;
/**
 * 线程的优先级
 *
 */
public class Demo2 {
  public void myThread1(){
	  //任务
	 MyWork1 work1=new MyWork1(); 
	 MyWork2 work2=new MyWork2();
	  //线程
	 Thread th1=new Thread(work1);
	 Thread th2=new Thread(work2);
	 
	  //线程名字
	  th1.setName("aaa");
	  th2.setName("zzz");
	 
	  //设置优先级
	  th1.setPriority(Thread.MAX_PRIORITY);
	  th2.setPriority(Thread.MIN_PRIORITY);
	  
	  //运行
	  th1.start();
	  th2.start();
	  
  }
  class MyWork1 implements Runnable{
	public void run() {
		String name =Thread.currentThread().getName();
		for(int i=0;i<10;i++){
			System.out.println(name+ "线程i=" +i);
		}
	}
} 
  class MyWork2 implements Runnable{
		public void run() {
			String name =Thread.currentThread().getName();
			for(int j=0;j<10;j++){
				System.out.println(name+ "线程i=" +j);
			}
		}
	} 
}
