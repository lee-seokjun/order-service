package com.example.orderservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class responseOrder {
    private String productId;
    private Integer qty;
    private String totalPrice;
    private Integer unitPrice;

    private Date createdAt;
    private String orderId;
}
