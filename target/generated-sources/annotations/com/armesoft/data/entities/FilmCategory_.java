package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilmCategory.class)
public abstract class FilmCategory_ {

	public static volatile SingularAttribute<FilmCategory, Date> lastUpdate;
	public static volatile SingularAttribute<FilmCategory, FilmCategoryPK> filmCategoryPK;
	public static volatile SingularAttribute<FilmCategory, Film> film;
	public static volatile SingularAttribute<FilmCategory, Category> category;

}

