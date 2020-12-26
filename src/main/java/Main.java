import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        System.out.println("PRIVET");
        String jsn  = new Gson().toJson("dsfsdfsd");
        System.out.println(jsn.toString());
    }
}
