package io.github.brucemercy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerBuildDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerBuildDemoApplication.class, args);
	}

	@GetMapping("/echo")
	public String echo(){
		return "Docker image build successful";
	}
}
