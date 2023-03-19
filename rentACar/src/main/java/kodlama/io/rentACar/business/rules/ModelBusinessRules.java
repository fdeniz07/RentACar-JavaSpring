package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ModelBusinessRules {

    private ModelRepository modelRepository;

    public void checkIfNameExists(String name) {

        if (this.modelRepository.existsByName(name)) {
            throw new BusinessException("Model name already exists!");
        }
    }

}
