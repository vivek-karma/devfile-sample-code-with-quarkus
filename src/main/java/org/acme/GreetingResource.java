package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class GreetingResource {

   @PostMapping("/")
    public String getFeedback(@RequestBody Feedback feedback) {
        return "Thanks for submitting feedback!";
    }
}
