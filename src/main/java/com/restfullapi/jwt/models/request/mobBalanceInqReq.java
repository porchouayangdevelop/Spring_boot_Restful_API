package com.restfullapi.jwt.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class mobBalanceInqReq {

    // header
    private String QCHNID;;
    private String QFFLAG;
    private String QFNAME;
    private String QFRNDAT;
    private String QFRNSEQ;
    private String QFRNTIM;
    private String QFTXCOD;
    private String QMTYPE;
    private String QPRMDESC;
    private String QSNAME;
    private String QTXBRC;
    private String QTXTEL;

    // body
    private String QACNO;
    private String QCCY;

}
