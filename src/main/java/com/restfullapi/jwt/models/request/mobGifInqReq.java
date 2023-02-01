package com.restfullapi.jwt.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class mobGifInqReq {

    // Header
    private String QCHNID;
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

    // Body
    private String QACNO;
    private String QCUSTNO;
    private String QINQTYP;

}
