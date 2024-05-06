package com.wipro.payment.Entity;

import com.wipro.booking.entity.BookingDetails;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Payment_Tbl")
public class Payment {
    @Id
    private int paymentId;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private BookingDetails booking;
	private int booking_id;
    private int transactionId;
    private double amount;
    public BookingDetails getBooking() {
		return booking;
	}
	public void setBooking(BookingDetails booking) {
		this.booking = booking;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", booking=" + booking + ", booking_id=" + booking_id
				+ ", transactionId=" + transactionId + ", amount=" + amount + "]";
	}
}
