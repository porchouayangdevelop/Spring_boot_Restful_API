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

    private String name;
    private String url;
    private String type;
    private long size;
}
