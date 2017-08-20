
public class Bank {


    float getRateOfInterest() {
        System.out.print("Bank : ");
        return 1;
    }


    public static void main(String[] args) {
        /*Bank b = new Bank();
        System.out.println(b.getRateOfInterest());
        b = new Lloyds();
        System.out.println(b.getRateOfInterest());

        System.out.println(b instanceof Bank);
        System.out.println(b instanceof Lloyds);
        b = new Barclays();
        System.out.println(b.getRateOfInterest());
        b=new HSBC();
        System.out.println(b.getRateOfInterest());*/

    }
}

class Lloyds extends Bank {

    float getRateOfInterest() {
        System.out.print("Lloyds : ");
        return 8f;
    }
    void getMoney(){
        System.out.println("Lloyds redraw : ");
    }
}

class Barclays extends Bank {

    float getRateOfInterest() {
        System.out.print("Barclays : ");
        return 10f;
    }
}

class HSBC extends Bank {

    float getRateOfInterest() {
        System.out.print("HSBC : ");
        return 50f;
    }
}
