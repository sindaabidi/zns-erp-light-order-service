package com.zns.erplight.dto;

import java.io.Serializable;
import java.util.List;

import com.zns.erplight.domain.Client;
import com.zns.erplight.domain.Commande;
import com.zns.erplight.domain.LigneCommande;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value="DTO Order",description="Order est un DTO non persistant, il inclut les données du Client, de la Commande et des lignes commande de cette dernière")
public class OrderDTO implements Serializable { 

    private static final long serialVersionUID = 1L;

    
    private Client client;
    
    private Commande commande;

    private List<LigneCommande> ligneCommande;

    /**
     * a DTO, for easy binding with Front-end ( In my case, I use Angular )
     */    
}
