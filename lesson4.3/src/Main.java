import java.util.Objects;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) {
       Logger logger = Logger.getLogger(Main.class.getName());
       Spy spy = new Spy(logger);
       MailMessage message = new MailMessage("Dima Sokolov","Austin Powers","Hello!!!");
       Sendable send = spy.processMail(message);
        System.out.println(Objects.toString(send));

    }

    private static void configureLogging() {
        Logger classA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger classB = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger classC = Logger.getLogger("org.stepic.java");

        classA.setLevel(Level.ALL);
        classB.setLevel(Level.WARNING);
        classC.setUseParentHandlers(false);

        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());

        classC.addHandler(handler);

    }

}
