package com.restfullapi.jwt.constant;

import lombok.Data;

@Data
public class mobBalInqXml {
    String mobBalInqXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Envelope>" +
            "    <Header>" +
            "        <QCHNID>17</QCHNID>" +
            "        <QFFLAG>0</QFFLAG>" +
            "        <QFNAME>Balance Inquiry</QFNAME>" +
            "        <QFRNDAT>20160701</QFRNDAT>" +
            "        <QFRNSEQ>IBNK00120222121415516</QFRNSEQ>" +
            "        <QFRNSYS>IBNK</QFRNSYS>" +
            "        <QFRNTIM>154515</QFRNTIM>" +
            "        <QFTXCOD>IBS0003</QFTXCOD>" +
            "        <QMTYPE>RQ</QMTYPE>" +
            "        <QPRMDESC>Balance Inquiry from IBNK</QPRMDESC>" +
            "        <QSNAME>0358020</QSNAME>" +
            "        <QTXBRC>600100</QTXBRC>" +
            "        <QTXTEL>BANK1010</QTXTEL>" +
            "    </Header>" +
            "    <Body>" +
            "        <QACNO>001000299093420159</QACNO>" +
            "        <QCCY>LAK</QCCY>" +
            "    </Body>" +
            "</Envelope>";

    mobBalInqXml(mobBalInqXml reqXml) {

    }
}
