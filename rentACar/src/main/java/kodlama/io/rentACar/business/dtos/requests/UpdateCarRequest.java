package kodlama.io.rentACar.business.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {


    private int id;

    @NotNull
    @NotBlank
    @Size(min=4,max = 4)
    private int modelYear;

    @NotNull
    @NotBlank
    @Size(min=3,max = 20)
    private String modelName;

    @NotNull
    @NotBlank
    private Double dailyPrice;
}
