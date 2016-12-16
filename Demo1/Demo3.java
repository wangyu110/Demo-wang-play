package com.yu.Demo1;
/**
 * 线程
 */
public class Demo3 {
    /**
     * 线程休眠，单线程休眠
     */
	public void myThread(){
		//任务
		MyTask1 task1 = new MyTask1();
		MyTask2 task2 = new MyTask2();
		//调用
		task1.run();
		task2.run();
	}
	
}
class MyTask1 implements  Runnable{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++){
			System.out.println(name+"线程，i="+i);
			if(i==4){
				System.out.println(name+"线程休眠");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class MyTask2 implements Runnable{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		 for(int j=0;j<10;j++){
			 System.out.println(name+"线程，j="+j);
			 try {
				Thread.sleep(2000);
				System.out.println(name+"线程阻塞");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		
	}
}
