import java.util.Vector;

public class MailComposer {

    public String address;

    public File attachment;

    public Vector myClient;

    public void send() {
    }

    public boolean verifyEmailAddress(address) {
        final Pattern mailCharacters = Pattern.compile("[a-z0-9!#$%&'*/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        final Pattern mailFormat = Pattern.compile("^(.+)@(.+)$");

        Matcher matcher = mailCharacters.matcher(adresa);
        Matcher matcher1 = mailFormat.matcher(adresa);

        if (matcher.find() && matcher1.find()) {
            return true;
        } else {
            return false;
        }
    }

    public void saveDraft() {
    }

    public void attach() {
    }

    public void checkFile() {
    }

    public void getFileSize() {
    }

}