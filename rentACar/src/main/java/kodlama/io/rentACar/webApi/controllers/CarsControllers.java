package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.dtos.requests.CreateCarRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateCarRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllCarsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //annotation
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsControllers {

    private CarService carService;

    @GetMapping()
    public List<GetAllCarsResponse> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCarResponse getById(@PathVariable int id) {
        return carService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateCarRequest createCarRequest) {
        this.carService.add(createCarRequest);
    }


    @PutMapping()
    public void update(@RequestBody() @Valid() UpdateCarRequest updateCarRequest) {
        this.carService.update(updateCarRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        this.carService.delete(id);
    }


}
