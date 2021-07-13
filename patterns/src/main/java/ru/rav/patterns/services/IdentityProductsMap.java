package ru.rav.patterns.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.rav.patterns.model.ProductEntity;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class IdentityProductsMap {

    private final ProductsDao productsDao;

    /**
     * Identity Map pattern
     */

    private Map<Long, ProductEntity> productMap = new HashMap<>();

    public void addProduct(ProductEntity productEntity) {
        productMap.put(productEntity.getId(), productEntity);
    }

    public ProductEntity getProduct(Long id) {
        if (productMap.containsKey(id)) {
            log.info("From map");
            return productMap.get(id);
        }
        log.info("From db");
        ProductEntity product = productsDao.get(id);
        addProduct(product);
        return product;
    }

}
