public class QueueNode<T> {
    private T data;
    private QueueNode<T> parent;
    private QueueNode<T> child;

    //Constructors

    public QueueNode () { //empty constructor

    }

    public QueueNode (T data) { //constructor with data

    }

    public QueueNode (QueueNode<T> child, T data) { //constructor with data and child node
        this.data = data;
        this.child = child;
    }

    //Methods and Accessors

    public T getData() { //data accessor method
        return this.data;
    }

    public void setData(T data) { //mutator for the data
        this.data = data;
    }

    public QueueNode<T> getChild () { //child accessor method
        return this.child;
    }

    public void setChild (QueueNode<T> child) { //child mutator method
        this.child = child;
    }

    public QueueNode<T> getParent () { //parent accessor method
        return this.parent;
    }

    public void setParent (QueueNode<T> parent) { //parent mutator method
        this.parent = parent;
    }

    //Other methods
    public String toString () {
        String datasout = " " + data;
        String parentsout = " " + parent;
        String childsout = " " + child;
        return "Data: " + datasout + " Parent: " + parent + " Child: " + childsout;
    }
}
