import java.util.*;

public class IntervalBSTIterator<K extends Interval> implements Iterator<K> {

	private Stack<IntervalBSTnode<K>> stack; //for keeping track of nodes
	
	public IntervalBSTIterator(IntervalBSTnode<K> root) {
		stack = new Stack<IntervalBSTnode<K>>();
		reverseInOrder(root);
	}
	
	private void reverseInOrder(IntervalBSTnode<K> cur){
		if(cur == null) return;
		reverseInOrder(cur.getRight());
		this.stack.push(cur);
		reverseInOrder(cur.getLeft());
	}
    public boolean hasNext() {
		return !this.stack.empty();	
    }

    public K next() {
		//TODO Remove this exception and implement the method
		return this.stack.pop();
    }

    public void remove() {
        // DO NOT CHANGE: you do not need to implement this method
        throw new UnsupportedOperationException();
    }
}