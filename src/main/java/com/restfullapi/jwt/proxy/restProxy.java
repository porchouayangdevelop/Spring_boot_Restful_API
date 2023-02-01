package com.restfullapi.jwt.proxy;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class restProxy {

    @Value("{${baseUrl}}")
    public String url;

    @Value("${mobBalanceInquiryPath}")
    public String BalancePath;

    @Value("${mobMiniStatementPath}")
    public String MiniStatementPath;

    @Value("${mobReversalTransactionPath}")
    public String ReveralTransactionPath;

    @Value("${mobOneToOneTransferPath}")
    public String OneToOneTransferPath;

    @Value("${mobGifInquiryPath}")
    public String GifInquiryPath;

    @Value("${mobAccountListInquiryPath}")
    public String AcctListInquiryPath;

    RestTemplate restTemplate = new RestTemplate();

    public String balanceInquiry(String xml) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(url + BalancePath + xml, entity, String.class);

        JSONObject json = XML.toJSONObject(response.getBody());
        return json.toString();
    }

    public String miniStatement(String xml) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(url + MiniStatementPath + xml, entity, String.class);

        JSONObject json = XML.toJSONObject(response.getBody());
        return json.toString();
    }

    public String oneToOneTransfer(String xml) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(url + OneToOneTransferPath + xml, entity, String.class);

        JSONObject json = XML.toJSONObject(response.getBody());
        return json.toString();
    }

    public String gifInquiry(String xml) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(url + GifInquiryPath + xml, entity, String.class);

        JSONObject json = XML.toJSONObject(response.getBody());
        return json.toString();
    }

    public String accountListInquiry(String xml) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(url + AcctListInquiryPath + xml, entity, String.class);

        JSONObject json = XML.toJSONObject(response.getBody());
        return json.toString();
    }

    public String reversalTransaction(String xml) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(url + ReveralTransactionPath + xml, entity, String.class);

        JSONObject json = XML.toJSONObject(response.getBody());
        return json.toString();
    }
}