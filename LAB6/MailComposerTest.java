import org.junit.Test;

import static org.junit.Assert.*;

public class MailComposerTest {

    @Test
    public void verifyMailAdress1() {
        MailComposer mailComposer = new MailComposer();
        String adresa = "java@gmail.com";

        assertEquals(mailComposer.verifyEmailAddress(adresa), true);
    }

    @Test
    public void verifyMailAdress2() {
        MailComposer mailComposer = new MailComposer();
        String adresa = "java@gmail.com";

        assertEquals(mailComposer.verifyEmailAddress(adresa), false);
    }


    @Test
    public void checkAttachmentSize1() {
        MailComposer mailComposer = new MailComposer();
        String path = "C:\\users";
        int maxSize = 100;

        assertEquals(mailComposer.checkAttachmentSize(path, maxSize), true);
    }

    @Test
    public void checkAttachmentSize2() {
        MailComposer mailComposer = new MailComposer();
        String path = "C:\\users";
        int maxSize = 100;

        assertEquals(mailComposer.checkAttachmentSize(path, maxSize), true);
    }

    @Test
    public void serialize1() {
        MailComposer mailComposer = new MailComposer();
        Email email = new Email();
        String path = "C:\\users";

        assertEquals(mailComposer.serialize(email, path), false);
    }

    @Test
    public void serialize2() {
        MailComposer mailComposer = new MailComposer();
        Email email = new Email();
        String path = "E:\\My folder\\Facultate\\Anul II\\Semestrul II\\IP\\Laborator 6\\Lab6.iml";

        assertEquals(mailComposer.serialize(email, path), true);
    }

    @Test
    public void checkIfFileExists1() {
        MailComposer draftManager = new MailComposer();
        String pathToFile = "C:\\Users\\Lucian\\Desktop\\test.txt";
        assertEquals(draftManager.checkIfFileExists(pathToFile),false);
    }


    @Test
    public void checkIfFileExists2() {
        MailComposer draftManager = new MailComposer();
        String pathToFile = "C:\\users";
        assertEquals(draftManager.checkIfFileExists(pathToFile),true);
    }
}