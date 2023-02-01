package com.restfullapi.jwt.constant;

import lombok.Data;

@Data
public class mobReversalTransXml {
    private String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Envelope>" +
            "    <Header>" +
            "        <QCHNID>17</QCHNID>" +
            "        <QFFLAG>0</QFFLAG>" +
            "        <QFRNDAT>20160731</QFRNDAT>" +
            "        <QFRNSEQ>IBNK20221215150963</QFRNSEQ>" +
            "        <QFRNSYS>BCOM</QFRNSYS>" +
            "        <QFRNTIM>160915</QFRNTIM>" +
            "        <QFTXCOD>IBS0010</QFTXCOD>" +
            "        <QMTYPE>RQ</QMTYPE>" +
            "        <QPRMDESC>Reverse Transaction From BCOME</QPRMDESC>" +
            "        <QTXBRC>600100</QTXBRC>" +
            "        <QTXTEL>BANK1010</QTXTEL>" +
            "    </Header>" +
            "    <Body>" +
            "        <QOFRSEQ>IBNK20221218144517</QOFRSEQ>" +
            "    </Body>" +
            "</Envelope>";

    mobReversalTransXml(mobReversalTransXml reqXml) {

    }
}
