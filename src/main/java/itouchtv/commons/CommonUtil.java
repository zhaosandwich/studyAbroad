package itouchtv.commons;

import java.util.HashMap;
import java.util.Map;


public class CommonUtil {


    public static Map<String, Object> returnError(int errorCode, String errorMessage) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", errorCode);
        map.put("errorMessage", errorMessage);
        return map;
    }
    public static Map<String, Object> returnOK(int Code, String Message) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Code", Code);
        map.put("Message", Message);
        return map;
    }
}
