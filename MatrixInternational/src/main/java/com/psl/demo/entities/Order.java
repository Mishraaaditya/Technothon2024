package com.psl.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private List<OrderItem> productList;
	private String dealer;
	
	private OrderStatus status;
	
	  public enum OrderStatus {
	    PENDING, APPROVED, REJECTED  
	  }

}
