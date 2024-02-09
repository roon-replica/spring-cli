package {{root-package}}.internal.dao;

import {{root-package}}.internal.dto.InternalBadgeDto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class Internal{{capitalizeFirst entity}}Dao {

	private final MongoTemplate mongoTemplate;

	public Internal{{capitalizeFirst entity}}Dao(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public Optional<Internal{{capitalizeFirst entity}}Dto> get{{capitalizeFirst entity}}ById(String id) {

		return Optional.ofNullable(mongoTemplate.findById(id, Internal{{capitalizeFirst entity}}Dto.class));

	}

	@SuppressWarnings("java:S4449")
	public List<Internal{{capitalizeFirst entity}}Dto> get{{capitalizeFirst entity}}s(int page, int pageSize) {
		Criteria criteria = Criteria.where(null);

		Query query = Query.query(criteria);
		query.with(PageRequest.of(page - 1, pageSize, Sort.by(List.of(Order.desc("id")))));

		return mongoTemplate.find(query, Internal{{capitalizeFirst entity}}Dto.class);
	}
}
