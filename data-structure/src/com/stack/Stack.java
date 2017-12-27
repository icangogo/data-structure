package com.stack;

public class Stack {
	static final int MAXLEN=50;
	Data [] datas=new Data[MAXLEN+1];
	int top;
	/**
	 * ��ʼ��ջ
	 * @return
	 */
	@SuppressWarnings("unused")
	public  Stack initStack() {
		Stack p=new Stack();
		if(p!=null) {
			p.top=0;
			return p;
		}
		return null;
	}
	 /**
	  * ��ջ
	  * @return
	  */
	public Data pop(Stack s) {
		Data data=null;
		if(s.top==0) {
			System.out.println("ջ�ѿգ�û��Ԫ��");
			System.exit(0);
		}
		data =s.datas[s.top];
		s.top--;
		return data;
		
	}
	/**
	 * ��ջ
	 * @return
	 */
	public int push(Stack s,Data data) {
		if(s.top==Stack.MAXLEN) {
			System.out.println("ռ�ռ��������޷���ջ");
			return 0;
		}else {
			s.datas[s.top+1]=data;
			s.top++;
			return 1;
		}
	}
	
	/**
	 * ��ջ
	 * @return
	 */
	public Data pull() {
		return null;
	}
	/**
	 * ���ջ
	 */
	public void clear(Stack s) {
		s.top=0;
		
	}
	/**
	 * �ж�ջ�Ƿ�����
	 * @return
	 */
	public Boolean isFull(Stack s) {
		return s.top==Stack.MAXLEN;
	}
	/**
	 * �ж�ջ�Ƿ�Ϊ��
	 * @param stack
	 * @return
	 */
	public Boolean isEmpty(Stack s) {
		return s.top==0;
	}
	
	
}
