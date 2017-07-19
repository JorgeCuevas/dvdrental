package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Actor.class)
public abstract class Actor_ {

	public static volatile SingularAttribute<Actor, String> firstName;
	public static volatile SingularAttribute<Actor, String> lastName;
	public static volatile CollectionAttribute<Actor, FilmActor> filmActorCollection;
	public static volatile SingularAttribute<Actor, Integer> actorId;
	public static volatile SingularAttribute<Actor, Date> lastUpdate;

}

