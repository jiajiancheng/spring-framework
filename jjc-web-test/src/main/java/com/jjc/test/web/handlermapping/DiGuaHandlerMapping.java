package com.jjc.test.web.handlermapping;

import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

public class DiGuaHandlerMapping implements HandlerMapping {

    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        String url = request.getRequestURI().toString();
        String method = request.getMethod();
        if (url.startsWith("/tudou")) {
            if (method.equalsIgnoreCase("get")) {
//                return "maidigua";
            } else if (method.equalsIgnoreCase("post")) {
//                return "shoudigua";
            } else {
//                return "";
            }
        }
        return null;
    }

}
