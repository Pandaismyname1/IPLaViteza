import java.util.Vector;

public class MailComposer {

    public String address;

    public File attachment;

    public Vector myClient;

    public void send() {
    }

    public boolean verifyEmailAddress(String address) {
        final Pattern mailCharacters = Pattern.compile("[a-z0-9!#$%&'*/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        final Pattern mailFormat = Pattern.compile("^(.+)@(.+)$");

        Matcher matcher = mailCharacters.matcher(address);
        Matcher matcher1 = mailFormat.matcher(address);

        if (matcher.find() && matcher1.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAttachmentSize(String Path, int maxFileSizeInMB)
    {
      File file = new File(Path);
      if(file.length()*1024*1024<maxFileSizeInMB)
      {
        return true;
      }
      return false;
    }

    public void saveDraft() {
    }

    public void attach() {
    }

    public void checkFile() {
    }

    public void getFileSize() {
    }

    public boolean serialize(Email mailToSerialize,String Path)
    {
      try {
        FileOutputStream fout = new FileOutputStream(Path);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(mailToSerialize);
      }
      catch (IOException e)
      {
        return false
      }
      return true;
    }
    boolean checkIfFileExists(String pathToFIle);

}