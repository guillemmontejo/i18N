import java.util.HashMap;
import java.util.ResourceBundle;

//Singleton

public class i18NManager {

    private static i18NManager manager;
    //data


    HashMap<String,ResourceBundle> data;

    private i18NManager(){
        this.data = new HashMap<String, ResourceBundle>();

        ResourceBundle ca = ResourceBundle.getBundle("ca");
        ResourceBundle es = ResourceBundle.getBundle("es");
        ResourceBundle en = ResourceBundle.getBundle("en");

        this.data.put("es", es);
        this.data.put("ca", ca);
        this.data.put("en", en);
    }

    public static i18NManager getInstance(){
        if (manager==null) manager = new i18NManager();
        return manager;
    }

    public String getText(String language, String key){
        String result = null;
        result = this.data.get(language).getString(key);
        return result;
    }

    public static void main(String[] args) {
        //Hola, Hola, Hello
        String Cat_1 = i18NManager.getInstance().getText("ca","l1");
        String Esp_1 = i18NManager.getInstance().getText("es","l1");
        String En_1 = i18NManager.getInstance().getText("en","l1");
        //Adeu, Adios, Bye
        String Cat_2 = i18NManager.getInstance().getText("ca","l2");
        String Esp_2 = i18NManager.getInstance().getText("es","l2");
        String En_2 = i18NManager.getInstance().getText("en","l2");
        //Gracies, Gracias, Thank you
        String Cat_3 = i18NManager.getInstance().getText("ca","l3");
        String Esp_3 = i18NManager.getInstance().getText("es","l3");
        String En_3 = i18NManager.getInstance().getText("en","l3");

        System.out.println(Cat_1);
        System.out.println(Esp_1);
        System.out.println(En_1);
        System.out.println(Cat_2);
        System.out.println(Esp_2);
        System.out.println(En_2);
        System.out.println(Cat_3);
        System.out.println(Esp_3);
        System.out.println(En_3);

    }
}
