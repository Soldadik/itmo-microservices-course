package com.order.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PaymentRequest
{
    @Id
    private long payment_ID;
    private long order_ID;
    private long payment_card_ID;
    private PaymentStatus status;
    private Date date;

    public PaymentRequest() {}

    public PaymentRequest(long payment_ID, long order_ID, long payment_card_ID, PaymentStatus status, Date date)
    {
        this.payment_ID = payment_ID;
        this.order_ID = order_ID;
        this.payment_card_ID = payment_card_ID;
        this.status = status;
        this.date = date;
    }

    public long getPayment_ID()
    {
        return payment_ID;
    }

    public void setPayment_ID(long payment_ID)
    {
        this.payment_ID = payment_ID;
    }

    public long getOrder_ID()
    {
        return order_ID;
    }

    public void setOrder_ID(long order_ID)
    {
        this.order_ID = order_ID;
    }

    public long getPayment_card_ID()
    {
        return payment_card_ID;
    }

    public void setPayment_card_ID(long payment_card_ID)
    {
        this.payment_card_ID = payment_card_ID;
    }

    public PaymentStatus getStatus()
    {
        return status;
    }

    public void setStatus(PaymentStatus status)
    {
        this.status = status;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}

enum PaymentStatus
{
    PAID,
    FAILED,
    WAITING
}