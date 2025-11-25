package com.api_communication.APIClients.Http_Clients.model;

public class CreateOrderResponse {
    Boolean created;
    String orderId;

    public CreateOrderResponse(Boolean created, String orderId) {
        this.created = created;
        this.orderId = orderId;
    }

    public CreateOrderResponse() {
    }

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
