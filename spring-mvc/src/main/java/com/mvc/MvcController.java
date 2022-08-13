package com.mvc;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dongchao
 * @time 2022-08-13 0:27
 */
@Controller
public class MvcController implements EnvironmentAware {

    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

    private Environment environment = null;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
