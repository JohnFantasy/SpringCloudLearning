package com.laofaner.springboot.controller.remote;


import cn.hutool.extra.ssh.JschUtil;
import com.jcraft.jsch.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class RemoteExecutionController {
    public static String executeCommand(String command) throws IOException {
        CommandLine cmd = new CommandLine(command);
        DefaultExecutor executor = new DefaultExecutor();
//        ExecuteResult result = executor.execute(cmd);
//        log.info("Command {} returned with exit code {}", command, result.getExitValue());
//        return result.getOutput();
        return null;
    }

    public static void main(String[] args) throws IOException, JSchException {

        Session session = JschUtil.getSession("192.210.200.105", 22, "root", "rz9n2N5mEt3T2GFE0b");
        String output = JschUtil.exec(session, "date", StandardCharsets.UTF_8);
        //需要什么命令呢？
        //1、grep命令，用于读取关键字行数
        //2、sed 命令，用于读取指定行范围
        //3、
        System.out.println(output);

        // todo 1、进程监控最早启动时间、重启次数
        // 2、日志监控，查看日志详情
        JschUtil.close(session);


    }

    // Define a method to execute the "tail -f" command on the remote Linux host
    public static List<String> executeTailCommand(String host, String logFilePath) throws IOException {
        // Create a command to execute
        String[] command = {"ssh", host, "tail", "-f", logFilePath};
        // Execute the command
        Process process = Runtime.getRuntime().exec(command);
        // Create a BufferedReader to read the output of the command
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        // Create a list to store the output lines
        List<String> output = new ArrayList<>();
        // Read the output lines and add them to the list
        String line;
        while ((line = reader.readLine()) != null) {
            output.add(line);
        }
        // Return the output list
        return output;
    }

}
