package com.restfullapi.jwt.constant;

import lombok.Data;

@Data
public class mobAcctListInqXml {

    private String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Envelope>" +
            "    <Header>" +
            "        <QCHNID>17</QCHNID>" +
            "        <QFFLAG>0</QFFLAG>" +
            "        <QFNAME>Account List Inquiry</QFNAME>" +
            "        <QFRNDAT>20230131</QFRNDAT>" +
            "        <QFRNSEQ>IBNK33023242122311551</QFRNSEQ>" +
            "        <QFRNSYS>IBNK</QFRNSYS>" +
            "        <QFRNTIM>102956</QFRNTIM>" +
            "        <QFTXCOD>IBS0020</QFTXCOD>" +
            "        <QMTYPE>RQ</QMTYPE>" +
            "        <QPRMDESC>Account List Inquiry from IBNK</QPRMDESC>" +
            "        <QSNAME>358024</QSNAME>" +
            "        <QTXBRC>600100</QTXBRC>" +
            "        <QTXTEL>BANK1008</QTXTEL>" +
            "    </Header>" +
            "    <Body>" +
            "        <QCINO>8200000034\21</QCINO>" +
            "    </Body>" +
            "</Envelope>";

    mobAcctListInqXml(mobAcctListInqXml reqXml) {
    }
}
