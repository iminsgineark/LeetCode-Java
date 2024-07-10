package Arrays;

class TreeNodeBSTPO {
    int val;
    TreeNodeBSTPO left;
    TreeNodeBSTPO right;
    TreeNodeBSTPO() {}
    TreeNodeBSTPO(int val) { this.val = val; }
    TreeNodeBSTPO(int val, TreeNodeBSTPO left, TreeNodeBSTPO right) {
        this.val = val;
        this.left = left;
         this.right = right;
     }
}

class BSTFromPreOrderTV {
    public TreeNodeBSTPO bstFromPreorder(int[] preorder) {
        return BstFromPreOrder(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public TreeNodeBSTPO BstFromPreOrder(int[] A, int bound, int[] i){
        if (i[0] == A.length || A[i[0]] > bound){
            return null;
        }
        TreeNodeBSTPO root = new TreeNodeBSTPO(A[i[0]++]);
        root.left = BstFromPreOrder(A,root.val,i);
        root.right = BstFromPreOrder(A,bound,i);
        return root;
    }
}
