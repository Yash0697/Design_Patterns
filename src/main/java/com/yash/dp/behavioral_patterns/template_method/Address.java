package com.yash.dp.behavioral_patterns.template_method;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {

    private String city;
    private String street;
    private Integer pinCode;
}
