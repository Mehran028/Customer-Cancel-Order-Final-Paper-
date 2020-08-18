package com.example.customer.Customer_cancel_order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.Customer_cancel_order.model.Order_Cancel;
import com.example.customer.Customer_cancel_order.repository.orderCancel_Repository;




@RestController
public class orderCancel_Controller {
	

    @Autowired
	orderCancel_Repository ordercancel_Repository;
	
	
	@PostMapping ("/orderSave")
	public String InsertOrder_Cancel(@RequestBody Order_Cancel order_cancel)  {
		
		//((CrudRepository<Order_Cancel, Long>) 
		
		ordercancel_Repository.save(order_cancel);
		
		return "Your record is saved successfully!!";
	} 
	
	
	
	
	@PostMapping ("/multipleOrderSave")
	public String InsertOrder_Cancel(@RequestBody List <Order_Cancel> order_cancel)  {
		
		ordercancel_Repository.saveAll(order_cancel);
		
		return "Record is saved successfully!!";
	}
	
	@GetMapping ("/getAllOrder")
	public List <Order_Cancel> getOreder_Cancel()  {

		
		return (List <Order_Cancel>)  ordercancel_Repository.findAll();
	}
	
	/* @GetMapping ("/getOrderByretailer_id/{id}")
	public List <Order_Cancel> getOrderByretailer_id(@PathVariable ("id") String retailer_id){

		return (List <Order_Cancel>)  ordercancel_Repository.findByreatiler_id(retailer_id);
	} */
	
	  @GetMapping ("/getByorderId/{orderId}")

	public Optional<Order_Cancel> getOrderById(@PathVariable ("orderId") Long id){

		return   ordercancel_Repository.findById(id);
		
	} 
	
	@PutMapping ("/update")
	
	public Order_Cancel updateOrder_Cancel(@RequestBody Order_Cancel order_cancel ) {
		
		return updateOrder_Cancel(order_cancel);
	}
	
	
@DeleteMapping ("/delete/{id}")
	
	public String deleteOrder_Cancel(@PathVariable Long id ) {
		
		return deleteOrder_Cancel(id);
	}

}

