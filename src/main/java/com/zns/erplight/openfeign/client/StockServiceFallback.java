package com.zns.erplight.openfeign.client;

 
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zns.erplight.domain.Produit;

@Component
public class StockServiceFallback implements  StockSericeClient{

   @Override
    public Produit getProduitById(Long produitId) {
//        return null;
        return null;

    }
   
   @Override
   public List<Produit> geProduits(){
       return Collections.emptyList();
   }
}