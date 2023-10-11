package DataStructure;

public class IntList {
    IntNode head;
    int length;
    public IntList(){
        this.length = 0;
    }
    public void add(int item){
        IntNode newNode = new IntNode(item);
        if(length == 0){
            head = newNode;
        }
        else {
            IntNode scan = head;
            while (scan.hasNext()) {
                scan = scan.next();
            }
            scan.next = newNode;
        }
        length++;
    }
    public void add(int item, int index){
        IntNode newNode = new IntNode(item);
        IntNode scan = head;
        if(index == 0){
            newNode.next = scan;
            head = newNode;
        }
        else{
            for(int i = 0; i < index-1; i++){
                scan = scan.next;
            }
            newNode.next = scan.next;
            scan.next = newNode;
        }
        length++;
    }
    public void delete(int index){
        IntNode scan = head;
        if(index == 0){
            head = scan.next;
        }
        else{
            for(int i = 0; i < index-1; i++){
                scan = scan.next;
            }
            scan.next = scan.next.next;
        }
        length--;
    }
    public int[] print(){
        IntNode scan = head;
        int[] result = new int[length];
        for(int i = 0; i < length; i++){
            result[i] = scan.getItem();
            scan = scan.next;
        }
        return result;
    }
    public int getLength(){
        return length;
    }
    public int getItem(int index){
        IntNode scan = head;
        for(int i = 0; i < index-1; i++){
            scan = scan.next;
        }
        return scan.getItem();
    }
}
