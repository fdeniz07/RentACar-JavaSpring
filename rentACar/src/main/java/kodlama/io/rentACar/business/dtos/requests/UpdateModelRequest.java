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
public class UpdateModelRequest {

    private int id;

    @NotNull
    @NotBlank
    @Size(min=3,max = 20)
    private String name;

    private int brandId;
}
