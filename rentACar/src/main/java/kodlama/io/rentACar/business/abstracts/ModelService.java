package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.dtos.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.dtos.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateModelRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdModelResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();

    GetByIdModelResponse getById(int id);

    void add(CreateModelRequest createModelRequest);

    void update(UpdateModelRequest updateModelRequest);

    void delete(int id);
}
