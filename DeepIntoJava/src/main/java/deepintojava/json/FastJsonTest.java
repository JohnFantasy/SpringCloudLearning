package deepintojava.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.Set;

public class FastJsonTest {

    public static void main(String[] args) {
        JSONObject json = getJson();

        String jsonString = json.toJSONString();

        JSONObject json1 = JSON.parseObject(jsonString);
        Set<Map.Entry<String, Object>> entries = json1.entrySet();
        entries.forEach(stringObjectEntry -> {
            String key = stringObjectEntry.getKey();
            Object value = stringObjectEntry.getValue();
            System.out.println(key + "------" + value);
        });
    }


    private static JSONObject getJson() {
        JSONObject json = new JSONObject();
        json.put("label1", "value1");
        json.put("label2", "value2");
        json.put("label3", "value3");
        json.put("label4", "value4");
        return json;
    }
}
