public class Number{
    //instance variables
    int value;
    int sign;
    int parity;

    //default constructor
    Number() {
        value = 0;
        sign = 0;
        parity = 0;
    }

    //overloaded constructor
    Number(int num){
        value = num;
        signCheck();
        parityCheck();
    }

    //methods

    void signCheck(){
        if(value > 0)
            sign = 1;
        else if(value < 0)
            sign = -1;
        else
            sign = 0;
    }

    void parityCheck(){
        if(value % 2 == 0)
            parity = 0;
        else
            parity = 1;
    }

    void display(){
        System.out.println("Representations of: " +value);
        System.out.println("Value: " +value);
        System.out.println("Sign: " +sign);
        System.out.println("Parity: " +parity +"\n");
    }
}