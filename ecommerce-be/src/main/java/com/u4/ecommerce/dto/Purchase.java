package com.u4.ecommerce.dto;

import com.u4.ecommerce.entity.Address;
import com.u4.ecommerce.entity.Customer;
import com.u4.ecommerce.entity.Order;
import com.u4.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
