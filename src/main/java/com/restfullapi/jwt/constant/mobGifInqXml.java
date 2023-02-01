package com.restfullapi.jwt.constant;

import lombok.Data;

@Data
public class mobGifInqXml {

    private String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Envelope>" +
            "    <Header>" +
            "        <QCHNID>17</QCHNID>" +
            "        <QFFLAG>0</QFFLAG>" +
            "        <QFNAME>CIF Inquiry (by A/c, Customer ID)</QFNAME>" +
            "        <QFRNDAT>20160731</QFRNDAT>" +
            "        <QFRNSEQ>IBNK20221214151822</QFRNSEQ>" +
            "        <QFRNSYS>IBNK</QFRNSYS>" +
            "        <QFRNTIM>102956</QFRNTIM>" +
            "        <QFTXCOD>IBS0012</QFTXCOD>" +
            "        <QMTYPE>RQ</QMTYPE>" +
            "        <QPRMDESC>CIF Inquiry (by A/c, Customer ID) from IBNK</QPRMDESC>" +
            "        <QSNAME>0028694</QSNAME>" +
            "        <QTXBRC>600100</QTXBRC>" +
            "        <QTXTEL>BANK1001</QTXTEL>" +
            "    </Header>" +
            "    <Body>" +
            "        <QACNO/>" +
            "        <QCUSTNO>810000000171</QCUSTNO>" +
            "        <QINQTYP>1</QINQTYP>" +
            "    </Body>" +
            "</Envelope>";

    mobGifInqXml(mobGifInqXml reqXml) {
    }
}
