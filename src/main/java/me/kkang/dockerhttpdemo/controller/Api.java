package me.kkang.dockerhttpdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/")
public class Api {

    @GetMapping("ping")
    public String ping() {
        return "[" + getInetAddress() + "] : Pong!!!";
    }

    private InetAddress getInetAddress() {
        try {
            return InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("unknown host!");
            return null;
        }
    }


}
