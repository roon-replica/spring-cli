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
public class Internal{{entity}}Controller {

	private final Internal{{entity}}Facade internal{{entity}}Facade;

	public Internal{{entity}}Controller(Internal{{entity}}Facade internal{{entity}}Facade) {
		this.internal{{entity}}Facade = internal{{entity}}Facade;
	}

	@Operation(summary = "Internal 조회용. {{entity}} 상세 조회(by {{lower entity}}Id)")
	@GetMapping("/{{lower entity}}s/{id}")
	public Internal{{entity}}Dto get{{entity}}ById(@PathVariable String id) {
		return internal{{entity}}Facade.get{{entity}}ById(id);
	}

	@Operation(summary = "페이지된 {{entity}} 목록")
	@GetMapping("/{{lower entity}}s")
	public PageNumberBasedPage<Internal{{entity}}Dto> get{{entity}}s(
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") @Min(1) @Max(20) int pageSize) {
		return internal{{entity}}Facade.get{{entity}}s(page, pageSize);
	}
}