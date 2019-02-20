package com.devfactory.simplepojos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {

    private String city;
    private String streenName;
    private Integer number;
    private String zipCode;

}
