package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile CollectionAttribute<City, Address> addressCollection;
	public static volatile SingularAttribute<City, String> city;
	public static volatile SingularAttribute<City, Date> lastUpdate;
	public static volatile SingularAttribute<City, Integer> cityId;
	public static volatile SingularAttribute<City, Country> countryId;

}

