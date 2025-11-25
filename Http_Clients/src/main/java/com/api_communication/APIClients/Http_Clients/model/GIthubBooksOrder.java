package com.api_communication.APIClients.Http_Clients.model;

import lombok.Data;

@Data
public class GIthubBooksOrder {
    String id;
    Integer bookId;
    String customerName;
    Integer quantity;

    public GIthubBooksOrder(String id, Integer bookId, String customerName, Integer quantity) {
        this.id = id;
        this.bookId = bookId;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    public GIthubBooksOrder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
