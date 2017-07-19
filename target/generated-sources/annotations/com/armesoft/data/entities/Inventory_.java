package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inventory.class)
public abstract class Inventory_ {

	public static volatile CollectionAttribute<Inventory, Rental> rentalCollection;
	public static volatile SingularAttribute<Inventory, Date> lastUpdate;
	public static volatile SingularAttribute<Inventory, Film> filmId;
	public static volatile SingularAttribute<Inventory, Integer> inventoryId;
	public static volatile SingularAttribute<Inventory, Short> storeId;

}

