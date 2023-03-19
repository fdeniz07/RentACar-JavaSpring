package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarBusinessRules {

    private CarRepository carRepository;

    public void checkIfCarModelYearExists(int modelYear) {

        if (this.carRepository.existsByModelYear(modelYear)) {
            throw new BusinessException("Car model year already exists!");
        }
    }
}
