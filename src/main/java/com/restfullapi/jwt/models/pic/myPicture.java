package com.restfullapi.jwt.models.pic;

import java.sql.Blob;

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
@Table(name = "user_pic")

public class myPicture {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")

    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String pic_id;

    @Lob
    private Blob picture;

}
