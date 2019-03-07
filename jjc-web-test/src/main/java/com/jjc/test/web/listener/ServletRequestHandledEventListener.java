package com.jjc.test.web.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * request处理信息，有处理时间哦<p/>
 * url=[/index]; client=[127.0.0.1]; method=[GET]; servlet=[jjc-web-test]; session=[783696DB9515EDF740F9F443FBF60062];
 * user=[null]; time=[18ms]; status=[OK]
 */
@Component
public class ServletRequestHandledEventListener implements ApplicationListener<ServletRequestHandledEvent> {

    public static final Log LOG = LogFactory.getLog(ServletRequestHandledEventListener.class);

    @Override
    public void onApplicationEvent(ServletRequestHandledEvent event) {
        LOG.info(event.getDescription());
    }

}
