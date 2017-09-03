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
		@Table(name = "DEPT_TBL")
		public class Department implements Serializable {
		 
		    private static final long serialVersionUID = -3465813074586302847L;
		 
		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private int dpto_id;
		 
		    @Column
		    private String name;
		    
		    @Column
		    private String description;

			public int getDpto_id() {
				return dpto_id;
			}

			public void setDpto_id(int dpto_id) {
				this.dpto_id = dpto_id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		    
		}


