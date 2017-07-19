package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rental.class)
public abstract class Rental_ {

	public static volatile SingularAttribute<Rental, Date> rentalDate;
	public static volatile SingularAttribute<Rental, Date> returnDate;
	public static volatile SingularAttribute<Rental, Date> lastUpdate;
	public static volatile SingularAttribute<Rental, Customer> customerId;
	public static volatile SingularAttribute<Rental, Inventory> inventoryId;
	public static volatile CollectionAttribute<Rental, Payment> paymentCollection;
	public static volatile SingularAttribute<Rental, Staff> staffId;
	public static volatile SingularAttribute<Rental, Integer> rentalId;

}

