package pjatk.edu.pl.jaz20497nbp.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pjatk.edu.pl.jaz20497nbp.models.Request;
import pjatk.edu.pl.jaz20497nbp.models.Root;
import pjatk.edu.pl.jaz20497nbp.repositories.NbpRepository;

@Service
public class NbpService {

    private final NbpRepository nbpRepository;
    private final RestTemplate restTemplate;

    public NbpService(NbpRepository nbpRepository, RestTemplate restTemplate) {
        this.nbpRepository = nbpRepository;
        this.restTemplate = restTemplate;
    }

    public Double getAvg(String from, String to, String currency) {
        String endpoint = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + from + "/" + to +
                "/?format=json";
        Double result = this.restTemplate.getForObject(endpoint, Root.class).getAverage();
        Request newRequest = new Request(currency, from, to, result);
        nbpRepository.save(newRequest);
        return result;
    }
}
