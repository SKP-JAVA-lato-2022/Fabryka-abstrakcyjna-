import app.Application;
import factories.GUIFactory;
import factories.MacOsFacotry;
import factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        Application app;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);
        if(osName.contains("mac")){
            guiFactory = new MacOsFacotry();
        }else{
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);
        app.paint();
    }
}