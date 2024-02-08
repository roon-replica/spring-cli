// Templated Java File
package {{root-package}}.{{feature}};

@RestController
public class {{capitalizeFirst feature}}Controller {
	@GetMapping("/{{feature}}")
	public String greeting(){
		return "Hello {{feature}}";
	}
}