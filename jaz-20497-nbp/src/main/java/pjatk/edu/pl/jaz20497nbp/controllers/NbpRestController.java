package pjatk.edu.pl.jaz20497nbp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.edu.pl.jaz20497nbp.services.NbpService;

@RestController
@RequestMapping("/nbp")
public class NbpRestController {

        private NbpService nbpService;

        public void NbpRestController(NbpService nbpService) {
        this.nbpService = nbpService;
        }

    @GetMapping("/avg/{currency}/{from}/{to}")
    public ResponseEntity<Double> getAvg(@PathVariable String currency, @PathVariable String from, @PathVariable String to) {
        return new ResponseEntity<>(nbpService.getAvg(from, to, currency), HttpStatus.OK);
    }
}
