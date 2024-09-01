package com.cottonmouth.ecommerce.dto;

import com.cottonmouth.ecommerce.entity.Address;
import com.cottonmouth.ecommerce.entity.Customer;
import com.cottonmouth.ecommerce.entity.OrderItem;
import jakarta.persistence.criteria.Order;
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
