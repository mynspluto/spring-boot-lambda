package org.example.springbootlambda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping("/hi")
  String hi() {
    return "hi";
  }
}
