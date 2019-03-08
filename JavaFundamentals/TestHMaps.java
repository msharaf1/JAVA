import java.util.HashMap;
import java.util.Set;

public class TestHMaps {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("FirstName","James");
        userMap.put("LastName","King");
        userMap.put("Address","123 South Kang Fu St, 22306");

        // System.out.println(userMap);
        String firstName = userMap.get("FirstName");
        String lastName = userMap.get("LastName");
        String address = userMap.get("Address");
        // System.out.println(firstName);
        // System.out.println(lastName);

        Set<String> keys = userMap.keySet();
       

        // for(String key: keys){
        //     System.out.println(key);
        //     System.out.println(userMap.get(key));
        // }
        for(String key: keys){
            System.out.println(key +" "+ userMap.get(key));
            
        }
    }
    
    
}