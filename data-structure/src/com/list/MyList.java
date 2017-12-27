package com.list;

public class MyList {
	static final Integer MAX=10;
	Data [] data=new Data[MAX] ;
	int len;
	MyList(){
		this.len=0;
	}
	//返回list中元素个数
	public int size() {
		return this.len;
	}
	//判断list是否为空
	public Boolean emply(){
		if(this.len==0) {
			return true;
		}
		return false;
	}
	//list中添加元素
	public int insert(MyList list,int n,Data data) {
		int i;
		if(list.len>=MyList.MAX) {
			System.out.println("集合已满，不能插入新值");
			return 0;
		}
		if(n<1||n>list.len-1) {
			System.out.println("您出入元素的序号有问题，不能够插入");
			return 0;
		}
		for(i=list.len;i>=n;i--){
			list.data[i+1]=list.data[i];
		}
		list.data[i]=data;
		list.len++;
		return 1;
	}
	//在List的末尾追加元素
	public int add(MyList list,Data data) {
		if(list.len>=MyList.MAX) {
			System.out.println("集合已满，不能添加新值");
		}
		list.data[list.len]=data;
		list.len++;
		return 1;
	}
	//删除元素
	public int delete(MyList list,int n) {
		int i;
		if(n>list.len||n<1) {
			System.out.println("您输入的N有误");
			return 0;
		}
		for(i=n-1;i<list.len;i++) {
			list.data[i]=list.data[i+1];
		}
		return 1;	
	}
	//寻找第N个元素
	public Data findByCount(MyList list,int n) {
		if(n<1||n>list.len) {
			System.out.println("您输入的节点有误，请重新输入");
			return null;
		}
		return list.data[n-1];
	}
	//根据key查找元素
	public int findByKey(MyList list,String key) {
		int i;
		for(i=0;i<list.len;i++) {
			if(list.data[i].key.compareTo(key)==0) {
				return i+1;
			} 
		}
		return 0;
	}
}
