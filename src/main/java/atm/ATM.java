package atm;

public class ATM {
    private Bill firstBill;

    public ATM() {
        Bill5 bill5 = new Bill5();
        Bill10 bill10 = new Bill10();
        Bill20 bill20 = new Bill20();


        bill20.setNext(bill10);
        bill10.setNext(bill5);

        firstBill = bill20;
    }

    public void process(int amount) {
        firstBill.process(amount);
    }
}
