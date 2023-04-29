package com.zns.erplight.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value="Produit",description="Produit est un bean non persistant, il sert à être consommé à partir du deuxième Microsercice (https://nexio-stock-service.herokuapp.com/api/produits/)")
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;

     
    private Long id;

    
    private String code;

    private String marque;

    private String modele;

    private String caracteristiques;

    private BigDecimal prixUnitaire;

    private Long quantite;

 


   
}
