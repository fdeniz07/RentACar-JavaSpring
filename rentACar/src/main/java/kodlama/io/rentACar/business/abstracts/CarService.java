package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.dtos.requests.CreateCarRequest;
import kodlama.io.rentACar.business.dtos.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateCarRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateModelRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllCarsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdCarResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdModelResponse;

import java.util.List;

public interface CarService {

    List<GetAllCarsResponse> getAll();

    GetByIdCarResponse getById(int id);

    void add(CreateCarRequest createCarRequest);

    void update(UpdateCarRequest updateCarRequest);

    void delete(int id);
}
