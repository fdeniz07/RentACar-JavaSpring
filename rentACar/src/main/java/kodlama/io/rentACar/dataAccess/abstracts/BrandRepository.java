package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

    boolean existsByName(String name); // JPA repository'nin bazi keywordleri var. exists gördügünde boolean arkada sorgu olusturur. Spring JPA keywords olarak arastirilabilir
}
