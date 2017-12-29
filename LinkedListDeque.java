public class LinkedListDeque<typeOflink> {
    private int size;    
    public class node{
        public typeOflink item;
        public node next;
        public node(typeOflink data,node nextElement){
            item = data;
            next =nextElement;
        }

    }
    private node first;

public  LinkedListDeque(typeOflink x){
    first = new node(x,null);
    size = 1;
}
public LinkedListDeque(){
    size=0;
    
}
/*: Adds an item to the front of the Deque.*/
public void addFirst(typeOflink data)
{
    first=new node(data, first);
    size=size+1;
}
public void addLast(typeOflink data){
      node p = first;
      while(p.next!=null){
          p=p.next;
      }
      p.next=new node(data,null);
      size=size+1;

}
public boolean isEmpty(){
    return (size==0);
}
public int size(){
    return size;    
}
public void printDeque(){
    node p=first;
    while(p.next!=null){
        System.out.println(p.item);
        p=p.next;
    }
    System.out.println(p.item);/*only for the last node of the quene*/
}
public typeOflink removeFirst(){
    node p=first;
    first=first.next;
    size=size-1;
    return p.item;
}
public typeOflink removeLast(){
node p = first;
typeOflink re;
while(p.next.next!=null){p=p.next;}
size=size-1;
re=p.next.item;
p.next=null;
return re;
}
public typeOflink get(int index){
    int i=index;
    node p=first;
    int pointerTocurrentnode=1;
    while(pointerTocurrentnode!=i){
        p=p.next;
        pointerTocurrentnode=pointerTocurrentnode+1;
    }
    return p.item;

}


public static void main(String[] args) {
    LinkedListDeque<String> astringtest = new LinkedListDeque<String>("abcdeaf");
     astringtest.addFirst("this is my first not the start 1one ok?");
     astringtest.addFirst("this is my first not the start 2one ok?");
     astringtest.addFirst("this is my first not the start 3one ok?");
     astringtest.addFirst("this is my first not the start 4one ok?");
     astringtest.addFirst("this is my first not the start 5one ok?");
     LinkedListDeque<Integer> aninttest= new LinkedListDeque<Integer>(123);
       astringtest.addLast("thi is the last are you ok");
       astringtest.addFirst("this is the first of the list ok??");
       astringtest.addLast("this is the only last for the queen not hte last last");
       astringtest.get(2);
      astringtest.printDeque();
      System.out.println("the get itemis:");
      System.out.println(astringtest.get(5));

    
    

}}