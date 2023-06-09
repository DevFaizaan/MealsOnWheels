package groupproject.groupproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "foodtable")
public class Food {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "type")
		private String type;
		
		@Column(name = "description")
		private String description;

		@Column(name = "restaurant_address")
		private String restaurant_address;
		
		public Food() {
			
		}

		

		public String getRestaurant_address() {
			return restaurant_address;
		}




		public void setRestaurant_address(String restaurant_address) {
			this.restaurant_address = restaurant_address;
		}



		public Food(String name, String type, String description) {
			super();
			this.name = name;
			this.type = type;
			this.description = description;
			this.restaurant_address = restaurant_address;
		}



		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
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


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
