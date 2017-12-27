package com.tree;

import java.util.Scanner;

public class TreeOperation {
	private static final int MAXLEN = 20;
	Scanner input = new Scanner(System.in);

	// 初始化Tree
	@SuppressWarnings("unused")
	public Tree initTree() {
		Tree node = new Tree();
		if (node == null) {
			node.data = input.next();
			node.left = null;
			node.right = null;
			return node;
		}
		return null;

	}

	// 添加节点
	public void addTreeNode(Tree tree) {
		Tree ptree, parent;
		String data;
		int menesel;
		if ((ptree = new Tree()) != null) {
			System.out.println("请输入要加入节点的数据:\n");
			ptree.data = input.next();
			ptree.left = null;
			ptree.right = null;
			data = input.next();
			parent = this.findTreeNode(tree, data);   //设置父结点
			if(parent==null) {
				System.out.println("未找到父节点");
				ptree=null;
				return;
			}
			do {
				menesel=input.nextInt();      //1代表左子树，2代表右子树
				if(menesel==1||menesel==2) {
					switch (menesel) {
					case 1:
						if(parent.left!=null) {
							System.out.println("左子树结点不为空");
						}else {
							parent.left=ptree;
						}
						break;
					case 2:
						if(parent.right!=null) {
							System.out.println("右子树结点不为空");
						}else {
							parent.right=ptree;
						}
						break;
					default:
						System.out.println("输入的值无效");
					}
				}
			} while (menesel!=1&&menesel!=2);
		}
	}

	// 查找节点
	public Tree findTreeNode(Tree tree, String data) {
		Tree ptr;
		if(tree==null) {
			return null;
		}else {
			if(tree.data.equals(data)) {
				return tree;
			}else {
				if((ptr=findTreeNode(tree.left,data))!=null) {
					return ptr;
				}else if((ptr=findTreeNode(tree.right,data))!=null) {
					return ptr;
				}else {
					return null;
				}
			}
		}
	}
	// 获取左子树
	public Tree getLeftTree(Tree tree) {
		if(tree==null) {
			return null;
		}else {
			return tree.left;
		}
		
	}
	// 获取右子树
	public Tree getRightTree(Tree tree) {
		if(tree!=null) {
			return tree.right;
		}else {
			return null;
		}
	}
	// 判断空树
	public int isEmplyTree(Tree tree){
		if(tree!=null) {
			return 0;
		}else {
			return 1;
		}
	}
	// 计算二叉树深度
	public int depthTree(Tree tree) {
		int depthleft,depthright;
		if(tree==null) {
			return 0;
		}else {
			depthleft=this.depthTree(tree.left);
			depthright=this.depthTree(tree.right);
			if(depthleft>depthright) {
				return depthleft+1;
			}else {
				return depthright+1;
			}
		}
	}
	// 清空二叉树
	public void clearTree(Tree tree) {
		if(tree!=null) {
			this.clearTree(tree.left);
			this.clearTree(tree.right);
			tree=null;
		}
	}
	// 显示节点数据
	public void showNodeData(Tree tree) {
		System.out.println(tree.data);
	}
	// 按层遍历算法
	public void  levelTree(Tree tree) {
		Tree p;
		Tree [] q=new Tree[MAXLEN];
		int head=0,tail=0;
		if(tree!=null) {                       //把根元素引入队列
			tail=(tail+1)/TreeOperation.MAXLEN;  //设为循环队列
			q[tail]=tree;    
		}
		while(head!=tail) {                    //队列中有元素
			head=(head+1)/TreeOperation.MAXLEN;
			p=q[head];
			this.showNodeData(p);
			if(p.left!=null) {
				tail=(tail+1)/TreeOperation.MAXLEN;
				q[tail]=p.left;   
			}
			if(p.right!=null) {
				tail=(tail+1)/TreeOperation.MAXLEN;
				q[tail]=p.right;
			}
		}
		
	}
	// 先序遍历算法
	public void rootLRTree(Tree tree) {
		if(tree!=null) {
			this.showNodeData(tree);
			this.rootLRTree(tree.left);
			this.rootLRTree(tree.right);
		}
	}
	// 中序遍历算法
	public void lRootRTree(Tree tree){
		if(tree!=null) {
			this.lRootRTree(tree.left);
			this.showNodeData(tree);
			this.lRootRTree(tree.right);
		}
	}
	// 后序遍历算法
	public void lRRootTree(Tree tree) {
		if(tree!=null) {
			this.lRRootTree(tree.left);
			this.lRRootTree(tree.right);
			this.showNodeData(tree);
		}
	}

}
