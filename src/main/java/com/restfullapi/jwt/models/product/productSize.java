package com.restfullapi.jwt.models.product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.*;

@Entity
@Data
@Table(name = "size")
@AllArgsConstructor
@NoArgsConstructor
public class productSize {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "size", length = 50)
    @NotNull
    @Length(min = 3, max = 50)
    private String size;

}
