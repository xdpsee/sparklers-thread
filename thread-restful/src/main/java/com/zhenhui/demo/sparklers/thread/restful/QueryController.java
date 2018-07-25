package com.zhenhui.demo.sparklers.thread.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @RequestMapping(path = "/query", method = RequestMethod.GET)
    public String query() {
        return "query";
    }

}
