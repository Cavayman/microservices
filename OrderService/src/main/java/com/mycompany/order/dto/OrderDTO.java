package com.mycompany.order.dto;

public class OrderDTO {

    private Long id;
    private String orderName;
    private String userId;

    public OrderDTO() {
    }

    public OrderDTO(Long id, String userName, String password){
        this.id=id;
        this.orderName=userName;
        this.userId=password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public OrderDTO setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public OrderDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}