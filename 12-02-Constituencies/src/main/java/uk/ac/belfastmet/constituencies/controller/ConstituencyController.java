package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.ConstituencyJsonResponse;
import uk.ac.belfastmet.constituencies.domain.Member;

@Controller
@RequestMapping("/")
@EnableConfigurationProperties 
@ConfigurationProperties(prefix ="api")
public class ConstituencyController {
	
	@Value("${api.constituency.url}")
	private String baseUrl;
	
	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	private HashMap<String, String> constituency;
	
		
		public HashMap<String, String> getConstituency() {
			return constituency;
	}
	
		public void setConstituency(HashMap<String, String> constituency) {
			this.constituency = constituency;
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Constituency Map");
		return "homePage";
	}
	
	@GetMapping("/members/{constituency}")
	public String members(@PathVariable Integer constituency, Model model) {
		
		model.addAttribute("pageTitle", "List of Members");
		RestTemplate restTemplate = new RestTemplate();
		ConstituencyJsonResponse jsonResponse = restTemplate.getForObject
				(this.getBaseUrl() + constituency.toString(), ConstituencyJsonResponse.class);
		ArrayList<Member> members = jsonResponse.getAllMembersList().getMembers();
		
		model.addAttribute("members", members);
		return "memberList";
	}

}
