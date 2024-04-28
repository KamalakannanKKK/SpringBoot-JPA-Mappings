package com.spring.JPATypeOfMapping.ManytoneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	   @Id 
	   @GeneratedValue( strategy=GenerationType.AUTO )
	   private long id;
	   private String name;

	   public long getId() {
	      return id;
	   }

	   public void setId(long id) {
	      this.id = id;
	   }

	   public String getName( ){
	      return name;
	   }

	   public void setName( String deptName ){
	      this.name = deptName;
	   }
}
