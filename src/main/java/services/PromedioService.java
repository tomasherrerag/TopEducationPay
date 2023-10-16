package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PromedioRepository;

@Service
public class PromedioService {

    @Autowired
    PromedioRepository promedioRepository;
}
