package com.restfullapi.jwt.constant;

import lombok.Data;

@Data
public class mobMiniStatementXml {

    private String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Envelope>" +
            "    <Header>" +
            "        <QCHNID>17</QCHNID>" +
            "        <QFFLAG>0</QFFLAG>" +
            "        <QFNAME>ATM Mini-statement </QFNAME>" +
            "        <QFRNDAT>20230131</QFRNDAT>" +
            "        <QFRNSEQ>IBNK2042102213422223</QFRNSEQ>" +
            "        <QFRNSYS>IBNK</QFRNSYS>" +
            "        <QFRNTIM>102956</QFRNTIM>" +
            "        <QFTXCOD>IBS0021</QFTXCOD>" +
            "        <QMTYPE>RQ</QMTYPE>" +
            "        <QPRMDESC>Mini-statement  from IBNK</QPRMDESC>" +
            "        <QSNAME>9991011</QSNAME>" +
            "        <QTXBRC>600100</QTXBRC>" +
            "        <QTXTEL>BANK1010</QTXTEL>" +
            "    </Header>" +
            "    <Body>" +
            "        <QACCNO>001000299093420159</QACCNO>" +
            "        <QCCY>LAK</QCCY>" +
            "        <QENDDAT>20220103</QENDDAT>" +
            "        <QSTADAT>20160401</QSTADAT>" +
            "    </Body>" +
            "</Envelope>";

    mobMiniStatementXml(mobMiniStatementXml reqXml) {

    }

}
