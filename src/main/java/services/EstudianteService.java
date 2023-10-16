package services;

import entities.EstudianteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.EstudianteRepository;

import java.util.ArrayList;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;
}
