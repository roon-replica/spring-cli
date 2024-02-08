package {{root-package}}.{{entity}};

@Component
public class {{capitalizeFirst entity}}Facade {

	private final {{capitalizeFirst entity}}Dao {{entity}}Dao;

	public {{capitalizeFirst entity}}Facade({{capitalizeFirst entity}}Dao {{entity}}Dao) {this.{{entity}}Dao = {{entity}}Dao;}

	public List<{{capitalizeFirst entity}}Dto> get{{capitalizeFirst entity}}s() {
		return {{entity}}Dao.get{{capitalizeFirst entity}}s();
	}

	public {{capitalizeFirst entity}}Dto get{{capitalizeFirst entity}}(String {{entity}}Id) {

		return {{entity}}Dao.get{{capitalizeFirst entity}}({{entity}}Id).orElseThrow({{capitalizeFirst entity}}NotFoundException::new);

	}
}