package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilmActor.class)
public abstract class FilmActor_ {

	public static volatile SingularAttribute<FilmActor, Actor> actor;
	public static volatile SingularAttribute<FilmActor, FilmActorPK> filmActorPK;
	public static volatile SingularAttribute<FilmActor, Date> lastUpdate;
	public static volatile SingularAttribute<FilmActor, Film> film;

}

