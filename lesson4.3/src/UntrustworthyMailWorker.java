public class UntrustworthyMailWorker implements MailService {
    private RealMailService realMailService = new RealMailService();
    private MailService [] mailServices;

    public UntrustworthyMailWorker (MailService [] mails) {
        this.mailServices = mails;

    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService i:mailServices) {
            mail=i.processMail(mail);
        }
        realMailService.processMail(mail);
        return mail;
    }


    public RealMailService getRealMailService () {
        return realMailService;
    }
}
