package com.restfullapi.jwt.models.customer;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Table(name = "customers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class customer {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String firstName;
    private String lastName;
    private String occupation;
    private Integer phone;

    private String content;
    private String type;
    @Lob
    private byte[] image;

    public void addAttribute(String string, String base64Encoded) {
    }

    public void addAttribute(String string, ArrayList<customer> content2) {
    }

}
