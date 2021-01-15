package com.sleeper.scaffold.controller;

import com.sleeper.log.sleeperLogApi;
import com.sleeper.common.model.resp.Resp;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController implements sleeperLogApi {

    @PostMapping("/demo/echo")
    public Resp echo(String body) {
        bizLog.info("req {}", body);
        return Resp.success(body);
    }
}
