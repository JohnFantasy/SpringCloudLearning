package com.laofaner.springboot.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.BitOP;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisUtil {

    @Autowired
    private JedisPool jedisPool;

    /**
     * 存储字符串键值对，永久有效
     */
    public String set(String key, String value) {
        try (Jedis jedis = jedisPool.getResource()) {
            return jedis.set(key, value);
        } catch (Exception e) {
            return "-1";
        }
    }

    /**
     * 根据传入key获取指定Value
     */
    public String get(String key) {
        try (Jedis jedis = jedisPool.getResource()) {
            return jedis.get(key);
        } catch (Exception e) {
            return "-1";
        }
    }

    /**
     * 根据传入key获取指定Value
     */
    public byte[] get(byte[] key) {
        try (Jedis jedis = jedisPool.getResource()) {
            return jedis.get(key);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 删除字符串键值对
     */
    public Long del(String key) {
        Jedis jedis = jedisPool.getResource();
        try {
            return jedis.del(key);
        } catch (Exception e) {
            return -1L;
        } finally {
            assert jedis != null;
            jedis.close();
        }
    }

    /**
     * 校验Key值是否存在
     */
    public Boolean exists(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.exists(key);
        } catch (Exception e) {
            return false;
        } finally {
            // 归还连接
            assert jedis != null;
            jedis.close();
        }
    }

    /**
     * setbit
     */
    public Boolean bitset(String key, Integer offset, Boolean value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.setbit(key, offset, value);
        } catch (Exception e) {
            return false;
        } finally {
            // 归还连接
            assert jedis != null;
            jedis.close();
        }
    }

    /**
     * getbit
     */
    public Boolean getbit(String key, Integer offset) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.getbit(key, offset);
        } catch (Exception e) {
            return false;
        } finally {
            // 归还连接
            assert jedis != null;
            jedis.close();
        }
    }

    /**
     * bitop
     */
    public Long bitmapAnd(String destKey, String[] labels) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.bitop(BitOP.AND, destKey, labels);
        } catch (Exception e) {
            return null;
        } finally {
            // 归还连接
            assert jedis != null;
            jedis.close();
        }
    }
}