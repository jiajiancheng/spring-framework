package com.jjc.test.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController implements EnvironmentAware {

    public static final Log LOGGER = LogFactory.getLog(IndexController.class);

    private Environment environment;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        LOGGER.info("index");
        return "index.jsp";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
