package edu.iu.camfraiz.primesservice.controller;

import edu.iu.camfraiz.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
   IPrimesService primesService;

   public PrimesController(IPrimesService primesService) {
       this.primesService = primesService;
   }

   @GetMapping("/{n}")
    public boolean isPrime(@PathVariable("n") int n) {
       return primesService.isPrime(n);
   }

}
