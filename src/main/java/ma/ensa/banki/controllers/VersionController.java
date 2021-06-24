package ma.ensa.banki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4201", "http://localhost:4202"})
@RestController
public class VersionController {


	@Autowired
	BuildProperties buildProperties;

	@GetMapping("/version")
	public String buildInfos() {
		return buildProperties.getVersion();
	}
}
