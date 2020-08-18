package com.example.customer.Customer_cancel_order.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "mydatabase")
public class Order_Cancel {

	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long orderId;
	
	private String items;

	private String idompotency_key;
	
	private boolean restock_items;
	
	private String cancellationReason_Description;
	
	private String retailer_id;
	
	private int quantity;
	
	
	
	

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getIdompotency_key() {
		return idompotency_key;
	}

	public void setIdompotency_key(String idompotency_key) {
		this.idompotency_key = idompotency_key;
	}

	public boolean isRestock_items() {
		return restock_items;
	}

	public void setRestock_items(boolean restock_items) {
		this.restock_items = restock_items;
	}

	public String getCancellationReason_Description() {
		return cancellationReason_Description;
	}

	public void setCancellationReason_Description(String cancellationReason_Description) {
		this.cancellationReason_Description = cancellationReason_Description;
	}

	public String getRetailer_id() {
		return retailer_id;
	}

	public void setRetailer_id(String retailer_id) {
		this.retailer_id = retailer_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

	@Override
	public String toString() {
		return "Order_Cancel [orderId=" + orderId + ", items=" + items + ", idompotency_key=" + idompotency_key
				+ ", restock_items=" + restock_items + ", cancellationReason_Description="
				+ cancellationReason_Description + ", retailer_id=" + retailer_id + ", quantity=" + quantity + "]";
	}
	

	
	
}

