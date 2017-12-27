package com.stack;

public class Stack {
	static final int MAXLEN=50;
	Data [] datas=new Data[MAXLEN+1];
	int top;
	/**
	 * 初始化栈
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
	  * 出栈
	  * @return
	  */
	public Data pop(Stack s) {
		Data data=null;
		if(s.top==0) {
			System.out.println("栈已空，没有元素");
			System.exit(0);
		}
		data =s.datas[s.top];
		s.top--;
		return data;
		
	}
	/**
	 * 入栈
	 * @return
	 */
	public int push(Stack s,Data data) {
		if(s.top==Stack.MAXLEN) {
			System.out.println("占空间已满，无法入栈");
			return 0;
		}else {
			s.datas[s.top+1]=data;
			s.top++;
			return 1;
		}
	}
	
	/**
	 * 入栈
	 * @return
	 */
	public Data pull() {
		return null;
	}
	/**
	 * 清空栈
	 */
	public void clear(Stack s) {
		s.top=0;
		
	}
	/**
	 * 判断栈是否已满
	 * @return
	 */
	public Boolean isFull(Stack s) {
		return s.top==Stack.MAXLEN;
	}
	/**
	 * 判断栈是否为空
	 * @param stack
	 * @return
	 */
	public Boolean isEmpty(Stack s) {
		return s.top==0;
	}
	
	
}
