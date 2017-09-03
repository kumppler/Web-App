package com.jwt.model;
	 
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	 
	//mark as an entity bean
	@Entity
	//persist data
	@Table(name = "USER_TBL")
	public class User implements Serializable {
	 
	    private static final long serialVersionUID = -3465813074586302847L;
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	 
	    @Column
	    private String name;
	 
	    @Column
	    private String email;
	 
	    @Column
	    private String address;
	 
	    @Column
	    private String telephone;
	    
	    @Column
	    private String dpto_id;
	    
	    @Column
	    private String description;
	 
	    public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDpto_id() {
			return dpto_id;
		}

		public void setDpto_id(String dpto_id) {
			this.dpto_id = dpto_id;
		}

		public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public String getEmail() {
	        return email;
	    }
	 
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 
	    public String getAddress() {
	        return address;
	    }
	 
	    public void setAddress(String address) {
	        this.address = address;
	    }
	 
	    public String getTelephone() {
	        return telephone;
	    }
	 
	    public void setTelephone(String telephone) {
	        this.telephone = telephone;
	    }
	 
	}
