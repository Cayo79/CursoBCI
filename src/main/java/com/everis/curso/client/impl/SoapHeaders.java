package com.everis.curso.client.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.transport.HeadersAwareSenderWebServiceConnection;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.Map;

public class SoapHeaders implements WebServiceMessageCallback {
    @Value("${api.server-headers}")
    private Map<String, String> headers;

    @Override
    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
        TransportContext context = TransportContextHolder.getTransportContext();
        HeadersAwareSenderWebServiceConnection connection = (HeadersAwareSenderWebServiceConnection) context
                .getConnection();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            connection.addRequestHeader(entry.getKey(), entry.getValue());
        }
    }
}
