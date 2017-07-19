package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Language.class)
public abstract class Language_ {

	public static volatile SingularAttribute<Language, Date> lastUpdate;
	public static volatile CollectionAttribute<Language, Film> filmCollection;
	public static volatile SingularAttribute<Language, Integer> languageId;
	public static volatile SingularAttribute<Language, String> name;

}

