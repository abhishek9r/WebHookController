package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


package com.example.webhook;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

    @PostMapping("/trigger")
    public ResponseEntity<String> triggerJob(@RequestBody Map<String, Object> payload) {
        String jobName = (String) payload.getOrDefault("job", "default_job");

        // Simulate job trigger (you'll call Atomic later)
        System.out.println("🔁 Job requested: " + jobName);

        return ResponseEntity.ok("✅ Job triggered: " + jobName);
    }
}



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

