package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Store.class)
public abstract class Store_ {

	public static volatile SingularAttribute<Store, Date> lastUpdate;
	public static volatile SingularAttribute<Store, Integer> storeId;
	public static volatile SingularAttribute<Store, Address> addressId;
	public static volatile SingularAttribute<Store, Staff> managerStaffId;

}

