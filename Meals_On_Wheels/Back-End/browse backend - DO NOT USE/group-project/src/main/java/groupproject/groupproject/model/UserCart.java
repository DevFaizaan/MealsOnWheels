package groupproject.groupproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usercart")
public class UserCart {

	@Id
	private long id;
	
	
	@Column(name = "userid")
	private long user_id;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "restaurant_address")
	private String restaurant_address;

	
	
	
	
	public String getRestaurant_address() {
		return restaurant_address;
	}


	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}


	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public UserCart(String name, String type) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.type = type;
		this.restaurant_address = restaurant_address;
	}


	public UserCart() {
		
	}

	
}
