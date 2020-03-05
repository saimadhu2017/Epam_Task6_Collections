package epam.com.Task6Collections;


public class Main
{
    public static void main(String[] args) 
    {
    	List<Integer> li = new List<Integer>();
 
        //to Add elements
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li);
         
        //to Remove elements from index
        li.remove(2);
        System.out.println(li);
         
        //To Get the element with index
        System.out.println( li.get(0) );
        System.out.println( li.get(1) );
 
        //Size of list
        System.out.println(li.size());
    }
}
