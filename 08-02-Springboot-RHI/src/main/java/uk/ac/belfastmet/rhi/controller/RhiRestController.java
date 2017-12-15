package uk.ac.belfastmet.rhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.service.RhiRestService;

@RestController
@RequestMapping("/api/rhi")
public class RhiRestController {
	
	@Autowired
	RhiRestService rhiRestService;

	public RhiRestController(RhiRestService rhiRestService) {
		super();
		this.rhiRestService = rhiRestService;
	}
	
	@GetMapping("/")
	public Iterable<Rhi>list(){
		return rhiRestService.list();
	}
	
	@PostMapping("/")
	public Rhi create(@RequestBody Rhi rhi) {
		return rhiRestService.create(rhi);
	}
	
	@GetMapping("/{rhiId}")
	public Rhi read(@PathVariable("rhiId") Integer rhiId) {
		return rhiRestService.read(rhiId);
	}
	
	@PutMapping("/{rhiId}")
	public Rhi update(@PathVariable("rhiId") Integer rhiId, @RequestBody Rhi rhi) {
		return rhiRestService.update(rhiId,  rhi);
	}
	
	@DeleteMapping("/{rhiId}")
	public void delete(@PathVariable("rhiId") Integer rhiId){
		rhiRestService.delete(rhiId);
	}

}
