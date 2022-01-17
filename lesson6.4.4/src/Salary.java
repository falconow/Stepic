public class Salary extends AbstractSendable <Integer>{
    private int sale;

    public Salary(String from, String to, Integer sale) {
        super(from, to, sale);
        this.sale = sale;
    }
}
