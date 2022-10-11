package org.nontster.ping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping(method = RequestMethod.GET, path = "/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}
