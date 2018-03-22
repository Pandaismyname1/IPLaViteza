public class Main {

    public static void main(String[] args) {

        IDE ide = new IDE();
        View view = new Content();
        Terminal terminal = new Terminal();
        Window window = new Window();
        Autocomplete autocomplete = new Autocomplete();
        SynthaxHighlighter synthaxHighlighter = new SynthaxHighlighter();
        PluginManager pluginManager = new PluginManager();
        Menu menu = new Menu();
        Content content = new Content();

        FileManager.getInstance();


        ide.newProject();


    }

}
