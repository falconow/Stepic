public class Thief implements MailService {
    private int price;
    private int sum;

    public Thief (int price) {
        this.price = price;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mail_pack = (MailPackage) mail;
            Package pack = mail_pack.getContent();
            if (pack.getPrice()>=price) {
                MailPackage new_pack = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of "+pack.getContent(),0));
                sum = sum+pack.getPrice();
                return (Sendable) new_pack;
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return sum;
    }
}
