package com.restfullapi.jwt.models.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class mobAccountListInqReq {

    // <Header>
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
    private String QSNAME;
    private String QTXBRC;
    private String QTXTEL;

    // <Body>
    private String QCINO;

}
