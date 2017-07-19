package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> firstName;
	public static volatile SingularAttribute<Customer, String> lastName;
	public static volatile CollectionAttribute<Customer, Rental> rentalCollection;
	public static volatile SingularAttribute<Customer, Date> lastUpdate;
	public static volatile SingularAttribute<Customer, Integer> customerId;
	public static volatile SingularAttribute<Customer, Integer> active;
	public static volatile SingularAttribute<Customer, Boolean> activebool;
	public static volatile SingularAttribute<Customer, Short> storeId;
	public static volatile CollectionAttribute<Customer, Payment> paymentCollection;
	public static volatile SingularAttribute<Customer, String> email;
	public static volatile SingularAttribute<Customer, Date> createDate;
	public static volatile SingularAttribute<Customer, Address> addressId;

}

