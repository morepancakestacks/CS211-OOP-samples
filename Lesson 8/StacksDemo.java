import java.util.Stack;
import java.util.Iterator;

class StacksDemo {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<Integer>();
        st.push(99);
        st.push(78);
        st.push(67);
        st.push(128);
        st.push(63);

        st.pop();
        System.out.println("Stack Elements:");
        for(Iterator<Integer> iter = st.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        int top = st.peek();
        System.out.print("\n\nTop of the stack: " + top);
    }
}