package com.restfullapi.jwt.models.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class mobBalanceInquiryRes {

    public String res = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
            "<root>" +
            "    <head>" +
            "        <originatorSerialNumber>IBNK00120222121415516</originatorSerialNumber>" +
            "        <requestSystemTransactionDate>20230201</requestSystemTransactionDate>" +
            "        <messageType>N</messageType>" +
            "        <messageCode>0000</messageCode>" +
            "        <messageDescription></messageDescription>" +
            "        <logNumber>0</logNumber>" +
            "    </head>" +
            "    <data>" +
            "        <currBal>10040090.00</currBal>" +
            "        <avlBal>9990090.00</avlBal>" +
            "        <ccy>LAK</ccy>" +
            "        <accType>10</accType>" +
            "    </data>" +
            "</root>";
}
