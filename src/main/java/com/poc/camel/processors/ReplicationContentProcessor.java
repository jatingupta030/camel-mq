package com.poc.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.File;
import java.util.Map;

/**
 * Created by ttnd on 15/11/16.
 */
public class ReplicationContentProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        // code can be used to set headers if the configurations not specified in applicationContext.xml

        /*Object body = exchange.getIn().getBody();
        exchange.getOut().setBody(body);
        Map headerMap = exchange.getIn().getHeaders();
        headerMap.put("Content-Encoding", "ISO-8859-1");
        headerMap.put("Content-Type", "application/cq5-replication-durbo");
        headerMap.put("Action", "Activate");
        headerMap.put("Authorization", "Basic YWRtaW46YWRtaW4=");
        headerMap.put("Path", "/content/geometrixx-gov/en/myforms");
        exchange.getOut().setHeaders(headerMap);*/
    }
}
