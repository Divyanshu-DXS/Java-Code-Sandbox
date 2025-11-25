package com.api_communication.APIClients.Http_Clients.model;

public class CreateOrderRequest {
    Integer bookId;
    String customerName;

    public CreateOrderRequest(Integer bookId, String customerName) {
        this.bookId = bookId;
        this.customerName = customerName;
    }

    public CreateOrderRequest() {
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
}
