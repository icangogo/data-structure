package com.linkList;

public class DataNode {
	Data data=new Data();
	DataNode nextNote=new DataNode();
	//添加首节点
	@SuppressWarnings("unused")
	public DataNode addFirst(DataNode head,Data data) {
		DataNode node=new DataNode();
		if(node==null) {
			System.out.println("内存分配失败！");
			return null;
		}else {
			node.data=data;
			node.nextNote=head;
			head=node;
			return head;
		} 
	
	}
	//追加节点
	@SuppressWarnings("unused")
	public DataNode addEndNode(DataNode head,Data data) {
		DataNode htemp;
		DataNode node=new DataNode();
		if(node==null) {
			System.out.println("内存分配失败！");
			return null;
		}else {
			node.data=data;
			node.nextNote=null;
			if(head==null) {
				head=node;
				return head;
			}
			htemp=head;
			while(htemp.nextNote!=null) {
				htemp=htemp.nextNote;
			}
			htemp.nextNote=node;
			return head;
		}
	}
	//插入节点
	@SuppressWarnings("unused")
	public DataNode insertNode(DataNode head,Data data,String key) {
		DataNode htemp,notetemp;
		DataNode node=new DataNode();
		if(node==null) {
			System.out.println("内存分配失败！");
			return null;
		}
		node.data=data;
		notetemp=findNode(head,key);
		if(notetemp!=null) {
			node.nextNote=notetemp.nextNote;
			notetemp.nextNote=node;
		}else {
			System.out.println("申请内存失败");
		}
		return head;
	}
	//删除节点
	public int deleteNode(DataNode head,String key) {
		DataNode htemp,note;
		htemp=head;
		while(htemp!=null) {
			if(htemp.nextNote.data.key.compareTo(key)==0) {
				note=htemp.nextNote.nextNote;
				htemp.nextNote=null;
				htemp.nextNote=note;
				return 1;
			}
		}
		return 0;
	} 
	//查找节点
	public DataNode findNode(DataNode head,String key) {
		DataNode htemp;
		htemp=head;
		while(htemp.nextNote!=null) {
			if(htemp.data.key.compareTo(key)==0) {
				return htemp;
			}
			htemp=htemp.nextNote;
		}
		return null;
	}
	//计算链表的长度
	public  int length(DataNode head) {
		int i=0;
		DataNode htemp=head;
		while(htemp.nextNote!=null) {
			i++;
			htemp=htemp.nextNote;
		}
		return i;
	}
	
}
