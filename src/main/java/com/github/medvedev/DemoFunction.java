package com.github.medvedev;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoFunction implements HttpFunction {

    private static final Logger log = LoggerFactory.getLogger(DemoFunction.class);

    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
        log.info("Demo logging entry");
        httpResponse.getWriter().append("response");
    }
}
