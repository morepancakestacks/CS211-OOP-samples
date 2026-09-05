class Main{
    public static void main (String[]args){
        Number sample = new Number();
        Number sample1 = new Number(34);

        sample.display();
        sample1.display();

        sample1.value = 4;
       // sample1.sign = 3;

        sample1.display();
    }
}