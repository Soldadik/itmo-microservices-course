package com.payment.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @Column(name = "payment_id")
    private long payment_ID;

    @NotBlank
    @Column(name = "order_id")
    private long order_ID;

    @NotBlank
    @Column(name = "payment_card_ID")
    private long payment_card_ID;

    @NotBlank
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @NotBlank
    @Column(name = "date")
    private Date date;

    public Payment() {}

    public Payment(long payment_ID, @NotBlank long order_ID, @NotBlank long payment_card_ID, @NotBlank PaymentStatus status, @NotBlank Date date)
    {
        super();
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
