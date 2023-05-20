package com.laofaner.springboot.controller.remote;

import cn.hutool.extra.ssh.JschUtil;
import com.jcraft.jsch.Session;

import java.nio.charset.StandardCharsets;

public class LogUtil {

    private String host;
    private int port;
    private String username;
    private String password;

    private Session session;

    public LogUtil(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.session = JschUtil.getSession(host, port, username, password);
    }

    public Session getSession() {
        return session;
    }

    public void closeSession() {
        JschUtil.close(session);
    }

    public String sed(int startLine, int endLine, String logFileAbsolutePath) {
        String command = String.format("sed -n '%s %sp' %s", startLine, endLine, logFileAbsolutePath);
        return JschUtil.exec(session, command, StandardCharsets.UTF_8);
    }

    public String grep(String keyword, int amount, String logFileAbsolutePath) {
        String command = String.format("grep -n '%s' %s| cut -d \":\" -f 1| tail -n %d ", keyword, logFileAbsolutePath, amount);
        return JschUtil.exec(session, command, StandardCharsets.UTF_8);
    }

    //修改python脚本，根据传入的日志匹配规则字符串替换mtail配置文件
    //进程监控最早启动时间、重启次数
    // another day has gone and I didn't do anything again
    public static void main(String[] args) {
        LogUtil logUtil = new LogUtil("192.210.200.105", 22, "root", "rz9n2N5mEt3T2GFE0b");
        String grep = logUtil.grep("GET", 100, "/var/log/nginx/access.log");
        logUtil.closeSession();
        System.out.println(grep);
    }
}
