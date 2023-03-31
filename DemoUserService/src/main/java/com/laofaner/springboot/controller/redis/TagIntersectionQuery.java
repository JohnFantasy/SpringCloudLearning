package com.laofaner.springboot.controller.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class TagIntersectionQuery {

    // A method to create a bitmap for each tag and set the bits for the items that have that tag
    public static void createBitmaps(Jedis jedis, String[] tags, String[][] items) {
        Pipeline pipeline = jedis.pipelined();
        for (int i = 0; i < tags.length; i++) {
            String tag = tags[i];
            String[] itemsWithTag = items[i];
            for (String item : itemsWithTag) {
                pipeline.setbit(tag, Long.parseLong(item), true);
            }
        }
        pipeline.sync();
    }

    // A method to perform a bitwise AND operation on the bitmaps of the given tags and return the result as a bitmap
    public static byte[] intersectTags(Jedis jedis, String[] tags) {
        if (tags == null || tags.length == 0) {
            return null;
        }
        if (tags.length == 1) {
            return jedis.get(tags[0].getBytes());
        }
        byte[] result = jedis.get(tags[0].getBytes());
        for (int i = 1; i < tags.length; i++) {
            result = jedis.bitop(redis.clients.jedis.BitOP.AND, "result".getBytes(), result, tags[i].getBytes()).toString().getBytes();
        }
        return result;
    }

    // A method to convert a bitmap to a list of item IDs that have all the given tags
    public static List<String> bitmapToList(byte[] bitmap) {
        List<String> list = new ArrayList<>();
        if (bitmap == null || bitmap.length == 0) {
            return list;
        }
        for (int i = 0; i < bitmap.length; i++) {
            byte b = bitmap[i];
            for (int j = 0; j < 8; j++) {
                int bit = (b >> (7 - j)) & 1;
                if (bit == 1) {
                    int id = i * 8 + j;
                    list.add(String.valueOf(id));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        // Create a Jedis instance to connect to Redis
        Jedis jedis = new Jedis("localhost");

        // Define some sample tags and items
        String[] tags = {"book", "movie", "music"};

        // The item IDs are assumed to be numbers from 0 to N-1
        // The items array is aligned with the tags array, so that items[i] contains the item IDs that have tag[i]

        String[][] items = {{"0", "1", "2"}, {"2", "3", "4"}, {"4", "5", "6"}};

        // Create bitmaps for each tag
        createBitmaps(jedis, tags, items);

        // Perform an intersection query on some tags
        String[] queryTags = {"book", "movie"};
        byte[] queryResult = intersectTags(jedis, queryTags);

        // Convert the query result to a list of item IDs
        List<String> queryList = bitmapToList(queryResult);

        // Print the query result
        System.out.println("Items that have both book and movie tags: " + queryList);

        // Close the Jedis connection
        jedis.close();
    }
}