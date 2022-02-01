package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/paieServiceFallBack")
    public String paieServiceFallBackMethod() {
        return "Payement Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/gestionVirementFallBack")
    public String gestionVirementFallBackMethod() {
        return "Virement Service is taking longer than Expected." +
                " Please try again later";
    }
}
