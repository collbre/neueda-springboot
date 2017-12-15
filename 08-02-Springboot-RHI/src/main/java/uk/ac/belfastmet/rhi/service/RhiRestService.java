package uk.ac.belfastmet.rhi.service;

import uk.ac.belfastmet.rhi.domain.Rhi;

public interface RhiRestService {

	Iterable<Rhi> list();
	
	Rhi create(Rhi rhi);
	
	Rhi read(Integer rhiId);
	
	Rhi update(Integer rhiId, Rhi rhi);
	
	void delete(Integer rhiId);
}
