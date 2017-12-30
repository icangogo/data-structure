package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphOpertion {
	static Scanner input=new Scanner(System.in);
	// 创建图
	public void createGraph(GraphMatrix gm){
		int i,j,k;
		int weight;                // 权
	    char startV,endV;          // 起始点，终止点
	    for(i=0;i<gm.vertexNum;i++){
	    	System.out.println("请输入第"+i+"顶点");
	    	gm.vertex[i]=(input.next().toCharArray())[0];
	    }
	    System.out.println("请输入构成图的边和权重");
	    for(k=0;i<gm.edgeNum;k++ ){
	    	System.out.println("请输入第"+k+"条边");
	    	startV=input.next().charAt(0);
	    	endV=input.next().charAt(0);
	    	weight=input.nextInt();
	    	for(i=0;startV!=gm.vertex[i];i++); 				// 查找起始顶点
	    	for(j=0;startV!=gm.vertex[j];j++);				// 查找终止顶点
	    	gm.edgeWeight[i][j]=weight;
	    	if(gm.graphType==1) {
	    		gm.edgeWeight[j][i]=weight;
	    	}
	    }
	}
	// 清空图
	public static void clearGraph(GraphMatrix gm) {
		int i,j;
		for(i=0;i<gm.vertexNum;i++) {
			for (j=0;j<gm.vertexNum;j++) {
				gm.edgeWeight[i][j]=GraphMatrix.MAX_VALUE;
			}
		}
	}
	// 打印图
	public void outGraph(GraphMatrix gm) {
		int i,j;
		// 输出顶点的信息
		for(i=0;i<gm.vertexNum;i++) {
			System.out.println(gm.vertex[i]);
		}
		System.out.println("--------");
		// 输出矩阵信息没有权重的位置为Z。
		for(i=0;i<gm.vertexNum;i++) {
			for(j=0;j<gm.vertexNum;j++) {
				if(gm.edgeWeight[i][j]==GraphMatrix.MAX_VALUE) {
					System.out.print("\tZ");
				}else {
					System.out.print(gm.edgeWeight[i][j]);
				}
			}
		}
	}
	// 从某个节点，开始深度遍历;遍历过，设值为1
	static void deepTraversalOne(GraphMatrix gm,int n) {
		int i;
		gm.isTrav[n]=1;
		System.out.println(gm.vertex[n]);
		for(i=0;i<GraphMatrix.MAX_NUM;i++) {
			if(gm.edgeWeight[n][i]!=GraphMatrix.MAX_NUM&&gm.isTrav[n]==0) {
				deepTraversalOne(gm,i) ;
			}
			
		}
	}
	// 深度遍历
	static void deepTraversalGraph(GraphMatrix gm) {
		int i;
		//清除遍历标记
		for(i=0;i<gm.vertexNum;i++) {
			gm.isTrav[i]=0;
		}
		System.out.println("开始遍历");
		for(i=0;i<gm.vertexNum;i++) {
			if(gm.isTrav[i]==0) {
				deepTraversalOne(gm,i);
			}
		}
	}
	// 广度遍历
	static void breadthTraversalGraph(GraphMatrix gm) {
		int i;
		Queue<Character> queue = new LinkedList<Character>(); 
		// 清除遍历标记
		for(i=0;i<gm.vertexNum;i++) {
			gm.isTrav[i]=0;
		} 
		// 遍历
		for(i=0;i<gm.vertexNum;i++) {
			if(gm.isTrav[i]==0) {
				gm.isTrav[i]=1;
				System.out.println(gm.vertex[i]);
				queue.add(gm.vertex[i]);
				while(!queue.isEmpty()) {
					int j=queue.poll();
					for(int k=0;k<gm.vertexNum;k++) {
						if(gm.edgeWeight[j][k]==GraphMatrix.MAX_NUM&&gm.isTrav[k]==0) {
							gm.isTrav[k]=i;
							System.out.println(gm.vertex[k]);
							queue.add(gm.vertex[k]);
						}
					}
				}
			}
		}
	}
	
}
