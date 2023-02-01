package com.restfullapi.jwt.constant;

import lombok.Data;

@Data
public class mobOneToOneTransXml {
    private String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Envelope>" +
            "    <Header>" +
            "        <QCHNID>17</QCHNID>" +
            "        <QFFLAG>0</QFFLAG>" +
            "        <QFNAME>One-to-One Transfer (cross ccy) </QFNAME>" +
            "        <QFRNDAT>20230130</QFRNDAT>" +
            "        <QFRNSEQ>IBNK20221241843451347</QFRNSEQ>" +
            "        <QFRNSYS>IBNK</QFRNSYS>" +
            "        <QFRNTIM>102956</QFRNTIM>" +
            "        <QFTXCOD>IBS0005</QFTXCOD>" +
            "        <QMTYPE>RQ</QMTYPE>" +
            "        <QPRMDESC>One-to-One Transfer (cross ccy) from IBNK2222</QPRMDESC>" +
            "        <QRESEND_FLG>Y</QRESEND_FLG>" +
            "        <QSNAME>0351040</QSNAME>" +
            "        <QTXBRC>600100</QTXBRC>" +
            "        <QTXTEL>BANK1010</QTXTEL>" +
            "    </Header>" +
            "    <Body>" +
            "        <dr_fee_amt/>" +
            "        <fee_amt>0</fee_amt>" +
            "        <fee_ccy/>" +
            "        <fee_description/>" +
            "        <fee_gl/>" +
            "        <fee_rate/>" +
            "        <issuedate/>" +
            "        <narrative>QCCCYsss</narrative>" +
            "        <offsetacc>001000100000015332</offsetacc>" +
            "        <offsetactyp>1</offsetactyp>" +
            "        <offsetamt>1000</offsetamt>" +
            "        <offsetccy>LAK</offsetccy>" +
            "        <remarks>TSEASE</remarks>" +
            "        <txnacc>001000299093420159</txnacc>" +
            "        <txnactyp>1</txnactyp>" +
            "        <txnamt>1000</txnamt>" +
            "        <txnccy>LAK</txnccy>" +
            "        <xrate>1</xrate>" +
            "    <txCcy>LAK</txCcy>" +
            "    <txAmt>1000</txAmt>" +
            "    </Body>" +
            "</Envelope>";

    mobOneToOneTransXml(mobOneToOneTransXml reqXml) {

    }
}
