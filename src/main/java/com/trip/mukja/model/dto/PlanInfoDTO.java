package com.trip.mukja.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@ApiModel(value="PlanInfoDTO (여행 플래너 상세 정보)")
public class PlanInfoDTO {
	
	private int infoNo;
	private int planId;
	private String img;
	private String content;
	private String x;
	private String y;
	private LocalDateTime day;

	

}
