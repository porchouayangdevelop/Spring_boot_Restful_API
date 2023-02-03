package com.restfullapi.jwt.models.uploads;

import org.springframework.http.ResponseEntity;

import com.restfullapi.jwt.models.customer.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class responseMsg {
    private Object data;

}
