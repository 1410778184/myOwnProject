package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/docker")
public class DockerController {
    @GetMapping("/getMessage")
    public String getMessage() {
        return "docker";
    }

}
