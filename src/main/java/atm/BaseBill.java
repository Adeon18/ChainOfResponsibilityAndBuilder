package atm;

public class BaseBill implements Bill{

    private int billNumber;
    private Bill next;

    public BaseBill(int billNumber) {
        this.billNumber = billNumber;
    }

    @Override
    public void setNext(Bill bill) {
        this.next = bill;
    }

    @Override
    public void process(int amount) {

        if (next != null) {
            next.process(amount % billNumber);
        } else if (amount % billNumber != 0) {
            throw new IllegalArgumentException();
        }

        System.out.println("Please receive " + amount / billNumber + " of " + billNumber + " UAH Bills.");
    }
}
