package com.restfullapi.jwt.models.uploads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class responseFile {
    private String id;
    private String bank_code;
    private String cif;
    private String status;
    private String reg_brn;
    private String req_date;
    private String req_telr;
    private String name;
    private String url;
    private String type;
    private long size;
}
