package com.laofaner.popularTools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;

public class GsonTest {

    public static void main(String[] args) {

        Entity1 entity1 = new Entity1();
        entity1.setCode("1");
        entity1.setMessage("message");


        Entity2 entity2 = new Entity2();
        entity2.setCode(1);
        entity2.setMessage("message");
        Gson gson = new GsonBuilder().create();
        String s = gson.toJson(entity1);

        Entity2 entity21 = gson.fromJson(s, Entity2.class);
        System.out.println(entity21);
    }

}

@Data
class Entity1 {
    private String code;

    private String message;
}


@Data
class Entity2 {
    private Integer code;

    private String message;
}
