package com.u4.ecommerce.service;

import com.u4.ecommerce.dto.Purchase;
import com.u4.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
