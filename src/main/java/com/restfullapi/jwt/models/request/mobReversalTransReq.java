package com.restfullapi.jwt.models.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class mobReversalTransReq {

    // <Header>
    private String QCHNID;
    private String QFFLAG;
    private String QFRNDAT;
    private String QFRNSEQ;
    private String QFRNSYS;
    private String QFRNTIM;
    private String QFTXCOD;
    private String QMTYPE;
    private String QPRMDESC;
    private String QTXBRC;
    private String QTXTEL;

    // <Body>;
    private String QOFRSEQ;
}
