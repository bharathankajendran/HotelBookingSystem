package com.wipro.bookingservice.model;

public class Payment {
	private Long paymentId;
    private Long transactionId;
    private Long bookingId;
    private double amount;
    private double paymentAmount;
    private String status;
	public Payment(Long paymentId, Long transactionId, Long bookingId, double amount, double paymentAmount,
			String status) {
		super();
		this.paymentId = paymentId;
		this.transactionId = transactionId;
		this.bookingId = bookingId;
		this.amount = amount;
		this.paymentAmount = paymentAmount;
		this.status = status;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
