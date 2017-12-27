package com.list;

public class MyList {
	static final Integer MAX=10;
	Data [] data=new Data[MAX] ;
	int len;
	MyList(){
		this.len=0;
	}
	//����list��Ԫ�ظ���
	public int size() {
		return this.len;
	}
	//�ж�list�Ƿ�Ϊ��
	public Boolean emply(){
		if(this.len==0) {
			return true;
		}
		return false;
	}
	//list�����Ԫ��
	public int insert(MyList list,int n,Data data) {
		int i;
		if(list.len>=MyList.MAX) {
			System.out.println("�������������ܲ�����ֵ");
			return 0;
		}
		if(n<1||n>list.len-1) {
			System.out.println("������Ԫ�ص���������⣬���ܹ�����");
			return 0;
		}
		for(i=list.len;i>=n;i--){
			list.data[i+1]=list.data[i];
		}
		list.data[i]=data;
		list.len++;
		return 1;
	}
	//��List��ĩβ׷��Ԫ��
	public int add(MyList list,Data data) {
		if(list.len>=MyList.MAX) {
			System.out.println("�������������������ֵ");
		}
		list.data[list.len]=data;
		list.len++;
		return 1;
	}
	//ɾ��Ԫ��
	public int delete(MyList list,int n) {
		int i;
		if(n>list.len||n<1) {
			System.out.println("�������N����");
			return 0;
		}
		for(i=n-1;i<list.len;i++) {
			list.data[i]=list.data[i+1];
		}
		return 1;	
	}
	//Ѱ�ҵ�N��Ԫ��
	public Data findByCount(MyList list,int n) {
		if(n<1||n>list.len) {
			System.out.println("������Ľڵ���������������");
			return null;
		}
		return list.data[n-1];
	}
	//����key����Ԫ��
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
