package com.cottonmouth.ecommerce.service;

import com.cottonmouth.ecommerce.dto.Purchase;
import com.cottonmouth.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
