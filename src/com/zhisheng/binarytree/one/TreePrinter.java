import java.util.*;


/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        // write code here
        if(root == null){
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();    //提前准备一个队列queue
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> layer = new ArrayList<ArrayList<Integer>>();
        TreeNode last = root;       //正在打印的当前行的最右节点
        TreeNode nlast = null;      //下一行的最右节点
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tem = queue.poll();//出队，将孩子添加进去
            arr.add(tem.val);
            if(tem.left!=null){
                queue.add(tem.left);//每入队一个节点，就更新nlast
                nlast = tem.left;
            }
            if(tem.right!=null){
                queue.add(tem.right);
                nlast = tem.right;
            }
            if(tem == last){//last出队时，更新last为last的右节点，也就是最新的nlast
                layer.add(arr);
                arr = new ArrayList<Integer>();
                last = nlast;
            }
        }

        //转换成二维数组
        int[][] num = new int[layer.size()][];
        for(int i=0;i<layer.size();i++){
            num[i] = new int[layer.get(i).size()];//数组赋值前要确定长度
            for(int j=0;j<layer.get(i).size();j++){
                num[i][j] = layer.get(i).get(j);
            }
        }
        return num;
    }
}