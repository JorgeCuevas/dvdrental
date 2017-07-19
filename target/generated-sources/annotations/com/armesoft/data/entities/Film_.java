package com.armesoft.data.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Film.class)
public abstract class Film_ {

	public static volatile SingularAttribute<Film, BigDecimal> rentalRate;
	public static volatile SingularAttribute<Film, Short> rentalDuration;
	public static volatile CollectionAttribute<Film, Inventory> inventoryCollection;
	public static volatile SingularAttribute<Film, Short> length;
	public static volatile SingularAttribute<Film, String> rating;
	public static volatile SingularAttribute<Film, Language> languageId;
	public static volatile SingularAttribute<Film, String> description;
	public static volatile SingularAttribute<Film, BigDecimal> replacementCost;
	public static volatile SingularAttribute<Film, String> title;
	public static volatile CollectionAttribute<Film, FilmActor> filmActorCollection;
	public static volatile CollectionAttribute<Film, FilmCategory> filmCategoryCollection;
	public static volatile SingularAttribute<Film, Integer> filmId;
	public static volatile SingularAttribute<Film, Date> lastUpdate;
	public static volatile SingularAttribute<Film, Object> fulltext;
	public static volatile SingularAttribute<Film, Integer> releaseYear;

}

