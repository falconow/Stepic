public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage pack_mail = (MailPackage) mail;
            Package pack = pack_mail.getContent();

            if (pack.getContent().equalsIgnoreCase("weapons") || pack.getContent().equalsIgnoreCase( "banned substance")) {
                throw new IllegalPackageException();
            }

            if (pack.getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
