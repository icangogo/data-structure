package com.graph;

public class GraphMatrix {
	 static final int MAX_NUM=20;
	 static final int MAX_VALUE=65535;
	 char [] vertex = new char[MAX_NUM]; // 保存顶点信息
	 int graphType;                      // 图的类型，1代表无向图，0代表有向图
	 int vertexNum;                      // 顶点的个数
	 int edgeNum; 						 // 边的个数	
	 int [] []edgeWeight = new int [MAX_NUM][MAX_NUM];  // 边的的权重
	 int [] isTrav =new int [MAX_NUM];      //图的遍历标志
}
