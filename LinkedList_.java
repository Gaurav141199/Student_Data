
public interface LinkedList_<T> {// Supports any class T
   public Position_<T> add(T e);              // Add element e to this list, returns it position in the list
   public iterator<T>  positions();// Returns an iterator for all positions in the list
   public int  count();                      // Returns the number of elements in the list
}