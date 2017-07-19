package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Staff.class)
public abstract class Staff_ {

	public static volatile SingularAttribute<Staff, String> lastName;
	public static volatile CollectionAttribute<Staff, Rental> rentalCollection;
	public static volatile SingularAttribute<Staff, Boolean> active;
	public static volatile SingularAttribute<Staff, Store> store;
	public static volatile SingularAttribute<Staff, Short> storeId;
	public static volatile CollectionAttribute<Staff, Payment> paymentCollection;
	public static volatile SingularAttribute<Staff, byte[]> picture;
	public static volatile SingularAttribute<Staff, Address> addressId;
	public static volatile SingularAttribute<Staff, String> firstName;
	public static volatile SingularAttribute<Staff, String> password;
	public static volatile SingularAttribute<Staff, Date> lastUpdate;
	public static volatile SingularAttribute<Staff, Integer> staffId;
	public static volatile SingularAttribute<Staff, String> email;
	public static volatile SingularAttribute<Staff, String> username;

}

