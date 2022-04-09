/**
 * @author Pablo Herrera & Jorge Andrino
 * @since 8/04/2022
 * @version 1
 *
 * Class that implements Priority Queue
 */
import java.util.Vector;
public class VectorHeap <E extends  Comparable<E>> implements PriorityQueue{
    protected Vector<E> data;

    //constructor de un nuevo priority queue
    VectorHeap(){
        data = new Vector<>();
    }

    //Constructor de la clase, crea un nuevo priorityQueue a partir de un vector generico existente
    VectorHeap(Vector<E> v){
        data = new Vector<>(v.size());
        for (E e : v) {
            add(e);
        }
    }

    /**
     * gets position of the parent
     * @param i integer
     * @return position
     */
    protected static int parent(int i){
        return (i-1)/2;
    }

    /**
     * gets position of the left son
     * @param i integer
     * @return position left son
     */
    protected static int left(int i){
        return 2*i +1;
    }

    /**
     * gets position of the right son
     * @param i integer
     * @return position right son
     */
    protected static int right(int i){
        return (2*i+1)+1;
    }

    /**
     * class that sort the heap
     * @param leaf
     */
    protected void percolateUp(int leaf){
        int parent = parent(leaf);
        E value = data.get(leaf);
        while(leaf > 0 && (value.compareTo(data.get(parent)))<0){
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }

    /**
     * pushes down node to sort heap
     * @param root
     */
    protected void pushDownRoot(int root)
    // pre: 0 <= root < size
    // post: moves node at index root down
    // to appropriate position in subtree
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos+1)).compareTo
                                (data.get(childpos)) < 0))
                {
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if ((data.get(childpos)).compareTo
                        (value) < 0)
                {
                    data.set(root,data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root,value);
                    return;
                }
            } else { // at a leaf! insert and halt
                data.set(root,value);
                return;
            }
        }
    }

    /**
     * gets first element of heap
     * @return node
     */
    @Override
    public E getFirst() {
        return data.get(0);
    }

    /**
     * removes element from heap
     * @return node
     */
    @Override
    public E remove() {
        E minval = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if(data.size()>1) pushDownRoot(0);
        return minval;
    }

    /**
     * add element to heap
     * @param value
     */
    public void add(Comparable value){
        data.add((E)value);
        percolateUp(data.size()-1);
    }

    /**
     * tells if heap is empty or not
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    /**
     * tells size of heap
     * @return size of heap
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * clears heap
     */
    @Override
    public void clear() {
        data.removeAllElements();
    }
}
