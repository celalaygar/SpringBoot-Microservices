package com.celal.aygar.dto;
 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import lombok.Builder;
import lombok.Data;


@Data
public class TicketDto {
	
	private Long ticketid;
 
    private String description;
 
    private String note;
 
    private Date ticketDate;
    
    private String assignee;

    private String priorityType;
     
    private String ticketStatus;
    
	private Date createdAt; 
	
	private Date updatedAt;
	
}
