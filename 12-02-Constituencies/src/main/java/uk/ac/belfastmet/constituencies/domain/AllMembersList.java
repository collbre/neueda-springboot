package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {
	
	@JsonProperty("Member")
	ArrayList<Member> members;	
	
}
