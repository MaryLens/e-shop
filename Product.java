package example.domain;

import java.util.UUID;

public class Product extends AIdentified implements ISellable {

    public Product(UUID uuid){
        setUuid(uuid);
    }

}
