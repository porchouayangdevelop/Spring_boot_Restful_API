package com.restfullapi.jwt.models.uploads;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "cimming")
public class uploadImg {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String Id;

    @Column(name = "BANK_CODE")
    private String BANK_CODE;

    @Column(name = "CIF")
    private String CIF;

    @Column(name = "IMG_TYPE")
    private String IMG_TYPE;

    @Column(name = "STATUS")
    private String STATUS;

    @Column(name = "IMG_NAME")
    private String IMG_NAME;

    @Column(name = "REG_BRN")
    private String REG_BRN;

    @Column(name = "REG_DATE")
    private String REG_DATE;

    @Column(name = "REG_TELR")
    private String REG_TELR;

    @Column(name = "IMG_CONTENT")
    @Lob
    private byte[] IMG_CONTENT;

}
