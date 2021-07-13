package ru.rav.patterns.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rav.patterns.model.ProductEntity;
import ru.rav.patterns.services.IdentityProductsMap;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductsController {

    private final IdentityProductsMap identityProductsMap;

    @GetMapping("/{id}")
    public ProductEntity get(@PathVariable Long id) {
        return identityProductsMap.getProduct(id);
    }

}
