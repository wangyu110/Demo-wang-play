package com.yu.Demo1;
/**
 * �߳�
 */
public class Demo3 {
    /**
     * �߳����ߣ����߳�����
     */
	public void myThread(){
		//����
		MyTask1 task1 = new MyTask1();
		MyTask2 task2 = new MyTask2();
		//����
		task1.run();
		task2.run();
	}
	
}
class MyTask1 implements  Runnable{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++){
			System.out.println(name+"�̣߳�i="+i);
			if(i==4){
				System.out.println(name+"�߳�����");
				
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
			 System.out.println(name+"�̣߳�j="+j);
			 try {
				Thread.sleep(2000);
				System.out.println(name+"�߳�����");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		
	}
}
