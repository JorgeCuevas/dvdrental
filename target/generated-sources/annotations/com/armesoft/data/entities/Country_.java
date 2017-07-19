package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Country.class)
public abstract class Country_ {

	public static volatile SingularAttribute<Country, String> country;
	public static volatile SingularAttribute<Country, Date> lastUpdate;
	public static volatile CollectionAttribute<Country, City> cityCollection;
	public static volatile SingularAttribute<Country, Integer> countryId;

}

