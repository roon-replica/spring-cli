package {{root-package}}.internal.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Schema(description = "Internal {{entity}} 정보")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document({{entity}}.COLLECTION_NAME)
public class Internal{{entity}}Dto {

	private String id;
}
