package {{root-package}}.internal.facade;

import {{root-package}}.internal.dao.InternalBadgeDao;
import {{root-package}}.internal.dto.InternalBadgeDto;
import org.springframework.stereotype.Component;

@Component
public class Internal{{entity}}Facade {

	private final Internal{{entity}}Dao internal{{entity}}Dao;

	public Internal{{entity}}Facade(Internal{{entity}}Dao internal{{entity}}Dao) {
		this.internal{{entity}}Dao = internal{{entity}}Dao;
	}

	public Internal{{entity}}Dto get{{entity}}ById(String id) {
		return internal{{entity}}Dao.get{{entity}}ById(id).orElseThrow({{entity}}NotFoundException::new);
	}

	public PageNumberBasedPage<Internal{{entity}}Dto> get{{entity}}s(int page, int pageSize) {
			return PageNumberBasedPage.convert(internal{{entity}}Dao.get{{entity}}s(page, pageSize),
					page, pageSize, internal{{entity}}Dao.getTotalCount(name)); }
}