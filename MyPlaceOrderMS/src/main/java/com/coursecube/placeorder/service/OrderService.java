package com.coursecube.placeorder.service;

import java.util.List;

import com.coursecube.placeorder.entity.Order;

public interface OrderService {
    public List<Order> getOrderByUserId(String userId);
    public Order getOrderByOrderId(Integer orderId);
}
