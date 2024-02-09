// Templated Java File
package {{root-package}}.internal;


import {{root-package}}.internal.dto.InternalBadgeDto;
import {{root-package}}.internal.facade.InternalBadgeFacade;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@InternalApiInterface
public class Internal{{capitalizeFirst entity}}Controller {

	private final Internal{{capitalizeFirst entity}}Facade internal{{capitalizeFirst entity}}Facade;

	public Internal{{capitalizeFirst entity}}Controller(Internal{{capitalizeFirst entity}}Facade internal{{capitalizeFirst entity}}Facade) {
		this.internal{{capitalizeFirst entity}}Facade = internal{{capitalizeFirst entity}}Facade;
	}

	@Operation(summary = "Internal 조회용. {{capitalizeFirst entity}} 상세 조회(by {{entity}}Id)")
	@GetMapping("/{{entity}}s/{id}")
	public Internal{{capitalizeFirst entity}}Dto get{{capitalizeFirst entity}}ById(@PathVariable String id) {
		return internal{{capitalizeFirst entity}}Facade.get{{capitalizeFirst entity}}ById(id);
	}

	@Operation(summary = "페이지된 {{capitalizeFirst entity}} 목록")
	@GetMapping("/{{entity}}s")
	public PageNumberBasedPage<Internal{{capitalizeFirst entity}}Dto> get{{capitalizeFirst entity}}s(
			@RequestParam(required = false) String name,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") @Min(1) @Max(20) int pageSize) {
		return internal{{capitalizeFirst entity}}Facade.get{{capitalizeFirst entity}}s(name, page, pageSize);
	}
}