package com.nttdata.observability.controller;

import com.nttdata.observability.service.MyUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  private static final Logger log = LoggerFactory.getLogger(MyController.class);
  private final MyUserService myUserService;

  MyController(MyUserService myUserService) {
    this.myUserService = myUserService;
  }

  @GetMapping("/user/{userId}")
  String userName(@PathVariable("userId") String userId) {
    log.info("Got a request");
    return myUserService.userName(userId);
  }
}
