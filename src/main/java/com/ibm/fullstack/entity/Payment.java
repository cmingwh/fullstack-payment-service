package com.ibm.fullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment", schema = "fullstack")
public class Payment {
	@Id
	@GeneratedValue
	@Column(name = "payment_id")
	private Long paymentId;
	
	@Column(name = "txn_type")
	private String txnType;
	
	@Column(name = "amount")
	private Float amount;
	
	@Column(name = "remarks")
	private String remarks;
	
	@Column(name = "mentor_id")
	private Long mentorId;
	
	@Column(name = "mentor_name")
	private String mentorName;
	
	@Column(name = "training_id")
	private Long trainingId;
	
	@Column(name = "skill_id")
	private String skillId;
	
}
