package com.armesoft.data.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, BigDecimal> amount;
	public static volatile SingularAttribute<Payment, Integer> paymentId;
	public static volatile SingularAttribute<Payment, Customer> customerId;
	public static volatile SingularAttribute<Payment, Date> paymentDate;
	public static volatile SingularAttribute<Payment, Staff> staffId;
	public static volatile SingularAttribute<Payment, Rental> rentalId;

}

