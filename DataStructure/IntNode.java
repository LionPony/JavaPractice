package DataStructure;

public class IntNode {
    int item;
    IntNode next;
    public IntNode(){
        this.next = null;
    }
    public IntNode(int item){
        this.item = item;
        this.next = null;
    }
    public boolean hasNext(){
        return next != null;
    }
    public IntNode next(){
        return next;
    }
    public int getItem(){
        return item;
    }
}
