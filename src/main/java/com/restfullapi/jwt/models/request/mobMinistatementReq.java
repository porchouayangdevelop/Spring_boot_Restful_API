package com.restfullapi.jwt.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class mobMinistatementReq {

    // header
    private String QCHNID;
    private String QFFLAG;
    private String QFNAME;
    private String QFRNDAT;
    private String QFRNSEQQFRNSEQ;
    private String QFRNSYS;
    private String QFRNTIM;
    private String QFTXCOD;
    private String QMTYPE;
    private String QPRMDES;
    private String QSNAME;
    private String QTXBRC;
    private String QTXTEL;

    // body
    private String QACCNO;
    private String QCCY;
    private String QENDDAT;
    private String QSTADA;
}
