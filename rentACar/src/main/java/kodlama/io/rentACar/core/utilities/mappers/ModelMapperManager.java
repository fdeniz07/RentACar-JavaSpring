package kodlama.io.rentACar.core.utilities.mappers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service // Her seferinde ModelMapper üretilmesin IOC ye yüklensin ve istenildiginde oradan cagrilsin
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {

    private ModelMapper modelMapper;

    @Override
    public ModelMapper forResponse() {

        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true) //Belirsizlik durumunda es gec,hata verme, kontrolü bana birak demek
                .setMatchingStrategy(MatchingStrategies.LOOSE);//Gevsek mapleme yap: Response de olan nesneleri mapler.

        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {

        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD); //Standard : requestten gelen her nesneyi mapler
                                                                   //Strict : Olursa her iki nesnenin de %100 maplenmesini yapar
        return this.modelMapper;
    }
}
