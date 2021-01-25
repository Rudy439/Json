package kosickaakademia.sk.json;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        JSONArray jArray = new JSONArray();

        obj.put("name", "Milan");
        obj.put("age", 33);
        obj.put("sport", "Hockey");
        obj.put("active", true);

        System.out.println(obj);

    }


    }

