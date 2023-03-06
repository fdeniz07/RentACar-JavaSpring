package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //Bu sinif bir DataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Audi"));
        brands.add(new Brand(3,"Mercedes"));
        brands.add(new Brand(4,"VW"));
        brands.add(new Brand(5,"Renault"));
    }

    @Override
    public List<Brand> getAll() {

        return brands;
    }
}
