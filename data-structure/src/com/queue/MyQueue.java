package com.queue;

public class MyQueue {
	private static final int MAXLEN=15;
	Data [] datas=new Data[MAXLEN];
	int head;
	int tail;
	//��ʼ������
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
	//�ж϶����Ƿ�Ϊ��
	public static int isEmply(MyQueue q) {
		int temp=0;
		if(q.head==q.tail) {
			temp=1;
		}
		return temp;
		
	}
	//�ж϶����Ƿ�Ϊ��
	public int isFull(MyQueue q) {
		int temp=0;
		if(q.tail==MyQueue.MAXLEN) {
			temp=1;
		}
		return temp;
	}
	//������еĳ���
	public int length(MyQueue q) {
		int temp=q.tail-q.head;
		return temp;
	}
	//��ն���
	public void clear(MyQueue q) {
		if(q!=null) {
			q.head=0;
			q.tail=0;
		}
	}
	//�ͷſռ�
	public void freeQueue(MyQueue q) {
		if(q!=null) {
			q=null;
		}
	}
	//�����
	public int enQueue(MyQueue q,Data data) {
		if(q.tail==MyQueue.MAXLEN) {
			System.out.println("�����������޷�����ռ�");
			return 0;
		}else {
			q.datas[q.tail]=data;
			q.tail++;
			return 1;
		}
	}
	//������
	public Data deQueue(MyQueue q){
		if(q.head==q.tail) {
			System.out.println("�����ѿգ�û������");
			System.exit(0);
		}else {
			return q.datas[q.head++];
		}
		return null;
	}
	//��ȡ�ڵ������
	public Data peekQueue(MyQueue q) {
		if(MyQueue.isEmply(q)==1) {
			System.out.println("����Ϊ��");
			return null;
		}else {
			return q.datas[q.head];
		}
	}
}
