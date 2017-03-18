package com.zlrx.javadevzed.lombok;

import lombok.Builder;

@Builder
public class Home {
    private String address;
    private Integer roomNumber;
    private Double squareMeter;
    private boolean storey;
    private Integer price;
}
