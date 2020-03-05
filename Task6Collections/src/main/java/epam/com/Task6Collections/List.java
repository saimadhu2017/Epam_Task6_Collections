package epam.com.Task6Collections;
import java.util.Arrays;

public class List<E>{
	    //Size of list
	    private int size = 0;
	     
	    //Default capacity of list is 10
	    private static final int CAPACITY = 10;
	     
	    //This array will store all elements added to list
	    private Object element[];
	 
	    //Default constructor
	    public List() {
	        element = new Object[CAPACITY];
	    }
	 
	    //Add method
	    public void add(E e) {
	        if (size == element.length) {
	            Capacity();
	        }
	        element[size++] = e;
	    }
	     
	    //Get method
	    @SuppressWarnings("unchecked")
	    public E get(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (E) element[i];
	    }
	     
	    //Remove method
	    @SuppressWarnings("unchecked")
	    public E remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = element[i];
	        int num = element.length - ( i + 1 ) ;
	        System.arraycopy( element, i + 1, element, i, num ) ;
	        size--;
	        return (E) item;
	    }
	     
	    //Get Size of list
	    public int size() {
	        return size;
	    }
	     
	    //Print method
	    @Override
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) 
	         {
	             sb.append(element[i].toString());
	             if(i<size-1)
	             {
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	     
	    private void Capacity() 
	    {
	        int newSize = element.length * 2;
	        element = Arrays.copyOf(element, newSize);
	    }             
}