package kr.couchcoding.books.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {

    @PostMapping("/form")
    public String formSample(@RequestParam Map<String, Object> inputs){
        log.info("inputs : " + inputs);
        return "mvc/index/index2";
    }
}
