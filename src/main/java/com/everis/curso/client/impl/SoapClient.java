package com.everis.curso.client.impl;

import com.everis.curso.model.soap.NumberToWords;
import com.everis.curso.model.soap.NumberToWordsResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;

@Service
@Component("NumberConversion")
public class SoapClient extends WebServiceGatewaySupport {

    @Value("${api.server-soap}")
    private String urlSoap;

    public String convertirNumeroPalabras(Long numero) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(BigInteger.valueOf(numero));
        NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(urlSoap,
                request);
        return response.getNumberToWordsResult();
    }

}
