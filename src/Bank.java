abstract class Bank{
    abstract int getRateOfInterest();
}
class MAIB extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class MICB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class TestAbstraction{
    public static void main(String args[]){
        Bank b;
        b=new MAIB();
        System.out.println("MAIB Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new MICB();
        System.out.println("MICB Rate of Interest is: "+b.getRateOfInterest()+" %");
    }}