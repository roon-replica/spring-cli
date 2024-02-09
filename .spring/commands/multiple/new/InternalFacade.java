package {{root-package}}.internal.facade;

import {{root-package}}.internal.dao.InternalBadgeDao;
import {{root-package}}.internal.dto.InternalBadgeDto;

import org.springframework.stereotype.Component;

@Component
public class Internal{{capitalizeFirst entity}}Facade {

	private final Internal{{capitalizeFirst entity}}Dao internal{{capitalizeFirst entity}}Dao;

	public Internal{{capitalizeFirst entity}}Facade(Internal{{capitalizeFirst entity}}Dao internal{{capitalizeFirst entity}}Dao) {
		this.internal{{capitalizeFirst entity}}Dao = internal{{capitalizeFirst entity}}Dao;
	}

	public Internal{{capitalizeFirst entity}}Dto get{{capitalizeFirst entity}}ById(String id) {

		return internal{{capitalizeFirst entity}}Dao.get{{capitalizeFirst entity}}ById(id).orElseThrow({{capitalizeFirst entity}}NotFoundException::new);

	public PageNumberBasedPage<Internal{{capitalizeFirst entity}}Dto> get{{capitalizeFirst entity}}s(int page, int pageSize) {
			return PageNumberBasedPage.convert(internal{{capitalizeFirst entity}}Dao.get{{capitalizeFirst entity}}s(page, pageSize),
					page, pageSize, internal{{capitalizeFirst entity}}Dao.getTotalCount(name));

	}

	}
}