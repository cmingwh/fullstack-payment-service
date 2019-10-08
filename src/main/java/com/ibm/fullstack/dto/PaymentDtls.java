package com.ibm.fullstack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDtls {
	private Long paymentId;
	private String txnType;
	private Float amount;
	private String remarks;
	private Long mentorId;
	private String mentorName;
	private Long trainingId;
	private String skillName;
	private Float totalAmountToMentor;

}
