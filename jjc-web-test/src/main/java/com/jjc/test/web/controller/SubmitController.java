package com.jjc.test.web.controller;

import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import java.util.UUID;

@Controller
public class SubmitController {

    public static final Log LOG = LogFactory.getLog(SubmitController.class);

    @RequestMapping(value = "submit", method = RequestMethod.GET)
    public String submit(RedirectAttributes ra){

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        RequestContextUtils.getOutputFlashMap(requestAttributes.getRequest()).put("name", "jjc");

        ra.addAttribute("local", "zh-cn");

        ra.addFlashAttribute("ordersId", UUID.randomUUID());

        return "redirect:showorders";
    }

    @RequestMapping(value = "showorders", method = RequestMethod.GET)
    public String showOrders(Model model){
        LOG.info(JSON.toJSONString(model));
        return "orders.jsp";
    }

}
