package     com.java.pratice;

//static member function and create Object in the java of program ;
abstract class OuterAbstract {
    abstract static class InnerAbstract {
        abstract void function();
        void masenger() {
            System.out.println("interface static method in the java :-");
        }
    }
    void inner_caller() {
        InnerAbstract innerCaller = new InnerAbstract() {
            void function() {
                System.out.println("function Abstract Anonymous class :-");
            }
        };
        innerCaller.masenger();
        innerCaller.function();
    }

}

public class p23 extends OuterAbstract {

    public static void main(String[] args) {
//without class  Object create dicrect class call interface call;
        p23 Object = new p23();
        Object.inner_caller();
    }
}
