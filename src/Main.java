public class Main {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.insertAtBeg(5);
        list.insertAtBeg(7);
        list.insertAtIndex(2,90);
        list.deleteAtIndex(1);
        list.show();
        list.Reverse(1);
        list.search(12);
        list.searchByIndex(4);
        list.cycle();
    }
}
