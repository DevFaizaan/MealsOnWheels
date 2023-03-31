package groupproject.groupproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "pastOrders")
public class PastOrder {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "userid")
	private long user_id;

	@Column(name = "restaurant_address")
	private String restaurant_address;
	
	@Column(name = "delivery_time")
	private String delivery_time;
	
	@Column(name = "order_time")
	private String order_time;

	
	
	
	public PastOrder() {
		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getRestaurant_address() {
		return restaurant_address;
	}

	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}

	public String getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public PastOrder(long user_id, String restaurant_address, String delivery_time, String order_time) {
		super();
		this.user_id = user_id;
		this.restaurant_address = restaurant_address;
		this.delivery_time = delivery_time;
		this.order_time = order_time;
	}
	
	
	
	
	
}