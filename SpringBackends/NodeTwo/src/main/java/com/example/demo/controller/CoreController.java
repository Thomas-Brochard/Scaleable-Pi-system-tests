package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController {
  
  @RequestMapping(value="/NodeOne")
  public ResponseEntity<String> mockSuccess() {
    
    return new ResponseEntity<String>("Hello World", HttpStatus.OK);
  }
  
}
