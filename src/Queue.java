public class Queue <T> {
    private int size = 0;
    private QueueNode<T> top;
    private QueueNode<T> bottom;
    //void enqueue(E element)    //add an element
    //E dequeue()                //remove and return the least recent element
    //boolean isEmpty()
    //int size()
    //E peek()                //look at the least recent element without removing


    public void Queue() { //Empty constructor

    }

    //Queue methods
    public void enqueue(T data) {
        if (top == null) { //if the top doesn't exist
            bottom = new QueueNode<T>(data); //making the bottom a new queue item
            top = bottom; //making the top and bottom the same
        } else { //if not
            QueueNode<T> newNode = new QueueNode<T>(data); //making a new node
            top.setParent(newNode); //the parent of the top item will be the new Node
            top = newNode; //the new top is the new node and the old top is now it's child
        }
        size++; //increasing size
    }

    public T dequeue() {
        if (size != 0) { //if the queue isn't empty
            QueueNode<T> newNode = bottom; //setting the newNode to the bottom
            T data2 = newNode.getData(); //getting the data from the previous bottom
            bottom = bottom.getParent(); //setting the new bottom to the item above it in queue
            size--; //decreasing size
            return data2; //returning the data of the item that was deleted
        } else {
            return null; //if it's empty, return null
        }
    }


    public boolean isEmpty () {
        return size == 0; //if it's empty, it'll return true, if not, it'll return false
    }

    public int size () {
        return size; //returns the size value
    }

    public T peek () {
        return bottom.getData(); //returning the data in the bottom item in the list
    }
}