package com.queue;

public class MyQueue {
	private static final int MAXLEN=15;
	Data [] datas=new Data[MAXLEN];
	int head;
	int tail;
	//初始化队列
	@SuppressWarnings("unused")
	public MyQueue init() {
		MyQueue q=new MyQueue();
		if(q!=null) {
			q.head=0;
			q.tail=0;
			return q;
		}else {
			return null;
		}
	}
	//判断队列是否为空
	public static int isEmply(MyQueue q) {
		int temp=0;
		if(q.head==q.tail) {
			temp=1;
		}
		return temp;
		
	}
	//判断队列是否为满
	public int isFull(MyQueue q) {
		int temp=0;
		if(q.tail==MyQueue.MAXLEN) {
			temp=1;
		}
		return temp;
	}
	//计算队列的长度
	public int length(MyQueue q) {
		int temp=q.tail-q.head;
		return temp;
	}
	//清空队列
	public void clear(MyQueue q) {
		if(q!=null) {
			q.head=0;
			q.tail=0;
		}
	}
	//释放空间
	public void freeQueue(MyQueue q) {
		if(q!=null) {
			q=null;
		}
	}
	//入队列
	public int enQueue(MyQueue q,Data data) {
		if(q.tail==MyQueue.MAXLEN) {
			System.out.println("队列已满，无法分配空间");
			return 0;
		}else {
			q.datas[q.tail]=data;
			q.tail++;
			return 1;
		}
	}
	//出队列
	public Data deQueue(MyQueue q){
		if(q.head==q.tail) {
			System.out.println("队列已空，没有数据");
			System.exit(0);
		}else {
			return q.datas[q.head++];
		}
		return null;
	}
	//读取节点的数据
	public Data peekQueue(MyQueue q) {
		if(MyQueue.isEmply(q)==1) {
			System.out.println("队列为空");
			return null;
		}else {
			return q.datas[q.head];
		}
	}
}
