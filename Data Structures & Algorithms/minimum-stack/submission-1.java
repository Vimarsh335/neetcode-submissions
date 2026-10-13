class MinStack {

    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {  
     st.push(val);

    if(!minst.isEmpty()){        
        if(minst.peek()>=val){
            minst.push(val);
        }
    }
    else{
        minst.push(val);
    }
    }
    
    public void pop() {
        int k = st.pop();
        if(minst.peek()==k){
            minst.pop();
        }        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
