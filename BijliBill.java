public class BijliBill {
    public static void main(String[] args) {
        int unit = 500;
        double amount = 0;
        if(unit > 400){
            amount=amount +(unit-400)*12;
            unit=400;
        }

        if(unit >200){
            amount = amount + (unit - 200) * 7;
            unit=200;
        }
        if(unit >100){
            amount =amount + (unit -100)*4;
            unit=100;

        }
        amount=amount+unit *4.2;
        System.out.println("Total Amount is: "+amount);

    }
}
