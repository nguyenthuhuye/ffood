//3.3 Write a program for the following
//1. Example for call by value.
//2. Example for call by reference.
public class b33 {
    int data=50;

    void change(int data){
        data=data+100;
    }

    void change(b33 op){
        op.data=op.data+100;
    }

    public static void main(String args[]){
        b33 op=new b33();

        op.change(500);
        System.out.println("call by value: "+op.data);
        op.change(op);
        System.out.println("Call by Reference "+op.data);

    }
}
