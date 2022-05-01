package ToyShop.Service.User;

import org.springframework.stereotype.Service;

import ToyShop.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(Integer totalData, Integer limit, Integer currentPage); 
	
	
}
