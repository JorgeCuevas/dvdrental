package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile CollectionAttribute<Address, Store> storeCollection;
	public static volatile SingularAttribute<Address, String> address;
	public static volatile SingularAttribute<Address, String> address2;
	public static volatile SingularAttribute<Address, String> phone;
	public static volatile CollectionAttribute<Address, Customer> customerCollection;
	public static volatile SingularAttribute<Address, String> district;
	public static volatile SingularAttribute<Address, String> postalCode;
	public static volatile SingularAttribute<Address, Date> lastUpdate;
	public static volatile CollectionAttribute<Address, Staff> staffCollection;
	public static volatile SingularAttribute<Address, City> cityId;
	public static volatile SingularAttribute<Address, Integer> addressId;

}

