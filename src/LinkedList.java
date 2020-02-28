public class LinkedList {
   Node head=null;
public void deleteAtIndex(int index){


                if (index==0){
                    head=head.next;
                }
                Node temp=head;
               for (int i=0;i<index-1;i++){
                   temp=temp.next;
               }


                Node node=null;
                node=temp.next;
                temp.next=node.next;
                node=null;






}
    public void insertAtIndex(int index, int data){
                Node node=new Node();
                node.data=data;
                node.next=null;
                Node temp=head;

                for (int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;


}


public void insertAtBeg(int data){
                Node node=new Node();
               node.data=data;
               node.next=null;

               if (head==null){
                   head=node;
               }else {
                   node.next=head;
                   head=node;
               }


}


public void insert(int data){

                Node node=new Node();

                node.data=data;
                node.next=null;

                if (head==null){

                    head=node;

                }else {
                    Node n=head;
                    while (n.next!=null){
                        n=n.next;
                    }
                    n.next=node;




                }

}
public void show(){
    Node node=head;
    while (node.next!=null){
        System.out.print(node.data+"->");
        node=node.next;
    }
    System.out.println(node.data);

}
public void Reverse(int position){

    Node current=head;
    Node prev=null;
    Node nextnode;
    while (current!=null){
        nextnode=current.next;
        current.next=prev;
        prev=current;
        current=nextnode;


    }
    head=prev;

    show();

    Node current_tail = head;

    for(int i=0;i<=position;i++){
        current_tail=current_tail.next;


    }
    System.out.println(current_tail.data);




}
public void search(int x)
{
    Node temp=head;
    int count =0;
    while(temp!=null){

        if (temp.data==x){
            System.out.println("element found "+count);
        }
        temp=temp.next;
        count++;

    }

}
public void searchByIndex(int index){

    Node temp=head;

    if (index==0){
        System.out.println("node value at index "+index+" is "+temp.data);

    }else {
        for (int i=0;i<index-1;i++){
            temp=temp.next;
        }
        System.out.println("node value at index "+index+" is "+temp.next.data);

    }


}
public void cycle(){


Node fast=head.next;
Node slow=head;



while (slow!=fast){

    if (fast==null||fast.next==null){
        System.out.println("false");
    }
}
   fast=fast.next.next;
   slow=  slow.next;

}
}
