import java.io.File;
import java.util.List;

public class FileManager extends View {

  private static FileManager instance;

  public static FileManager getInstance()
  {
    if (instance==null)
    {
      instance = new FileManager();
    }
    return instance;
  }

  public List<File> files;

  public Integer newAttr;


  public FileManager() {
    System.out.println("C - I'm a File Manager");
  }

  public void newFile() {
  }

  public void openFile() {

    System.out.println("M - The File Manager loaded a file");
  }

  public void deleteFile() {
  }

  public void saveFile() {
    System.out.println("M - The File Manager saved a file");
  }

  public void saveAs() {
  }

  public void newOperation() {
  }

}