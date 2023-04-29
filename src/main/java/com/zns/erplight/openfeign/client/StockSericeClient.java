package com.zns.erplight.openfeign.client;

 
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zns.erplight.config.Constants;
import com.zns.erplight.domain.Produit;
import com.zns.erplight.openfeign.config.FeignClientConfig;

import java.util.List;

@FeignClient(value = "produit-details",
        url = Constants.PRODUIT_API_URL_BASE,
        configuration = FeignClientConfig.class,
        fallback = StockSericeFallback.class)

public interface StockSericeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/produits/")
    List<Produit> geProduits();


    @RequestMapping(method = RequestMethod.GET, value = "/api/produits/{produitId}", produces = "application/json")
    Produit getProduitById(@PathVariable("produitId") Long produitId);
}