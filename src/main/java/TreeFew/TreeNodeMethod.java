package TreeFew;

public class TreeNodeMethod {

    public int getHigh(XKTreeNode tree){
        if(tree!=null){
            return 0;
        }
        int leftH = getHigh(tree.left);
        int rightH=getHigh(tree.right);
        return leftH>rightH?leftH+1:rightH+1;
    }
}
