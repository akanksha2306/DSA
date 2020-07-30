//package leetCode.Algorithms;
//
//
//public class StackImplementation {
//
//    //Stack implementation using link list
//    //create a node
//    StackImplementation()
//    {
//        this.top = null;
//    }
//
//    private class Node{
//
//        int data ;
//        Node link ;
//
//    }
//    Node oldfirst;
//    Node temp;
//
//    void push(int x){
//
//        Node first = new Node();
//
//        if(first== null){
//            System.out.println("return overflow");
//            return;
//        }
//        first.data = x;
//        //top should contain the link of the new node
//
//        first.link = oldfirst;
//
//        //>newNode--->top
//
//        oldfirst = first;
//    }
//
//
//
//    int peek(){
//        if(!isEmpty()){
//            return top.data;
//        }else{
//            System.out.println("Stack is empty");
//            return -1;
//        }
//    }
//
//    private boolean isEmpty() {
//        return top == null;
//    }
//
//    public int pop(){
//
//        if()
//
//
//    }
//
//
//}
