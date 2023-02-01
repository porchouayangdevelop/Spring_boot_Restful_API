package com.restfullapi.jwt.models.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class mobOneToOneTransReq {
    // header fields

    private String QCHNID;
    private String QFFLAG;
    private String QFNAME;
    private String QFRNDAT;
    private String QFRNSEQ;
    private String QFRNSYS;
    private String QFRNTIM;
    private String QFTXCOD;
    private String QMTYPE;
    private String QPRMDESC;
    private String QRESEND_FLG;
    private String QSNAME;
    private String QTXBRC;
    private String QTXTEL;

    // body fields
    private String dr_fee_amt;
    private String fee_amt;
    private String fee_ccy;
    private String fee_description;
    private String fee_gl;
    private String fee_rate;
    private String issuedate;
    private String narrative;
    private String offsetacc;
    private String offsetactyp;
    private String offsetamt;
    private String offsetccy;
    private String remarks;
    private String txnacc;
    private String txnactyp;
    private String txnamt;
    private String txnccy;
    private String xrate;
    private String txCcy;
    private String txAmt;

}
