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
/*: Adds an item to the front of the Deque.*/
public void addFirst(typeOflink data)
{
    first=new node(data, first);
    first.next=null;
    size=size+1;
}
public static void main(String[] args) {
    LinkedListDeque<String> astringtest = new LinkedListDeque<String>("abcdeaf");
     astringtest.addFirst("this is my first not the start 1one ok?");
     astringtest.addFirst("this is my first not the start 2one ok?");
     astringtest.addFirst("this is my first not the start 3one ok?");
     astringtest.addFirst("this is my first not the start 4one ok?");
     astringtest.addFirst("this is my first not the start 5one ok?");
     
    System.out.println(astringtest.first.item);
    System.out.println(astringtest.size);

}}