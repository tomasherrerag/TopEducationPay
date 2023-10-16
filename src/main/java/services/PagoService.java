package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PagoRepository;

@Service
public class PagoService {

    @Autowired
    PagoRepository pagoRepository;
}
