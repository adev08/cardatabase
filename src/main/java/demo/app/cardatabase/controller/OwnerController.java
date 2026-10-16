package demo.app.cardatabase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/owner")
//@RequiredArgsConstructor
@Tag(name = "Owner API", description = "Endpoints for managing Owner")
public class OwnerController {
	
	
	  @GetMapping("/{id}")
	  @Operation(summary = "Retrieve a Owner by ID", description = "Fetches owner details based on the provided ID.")
	    public long getOwner(@PathVariable(value = "id") Long id) {
	        return 1L;
	    }

}