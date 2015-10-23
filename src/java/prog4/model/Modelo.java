/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author alexandre.hauffe
 */
@Entity
public class Modelo {
    @Id
    @GeneratedValue()
    private long id;
    private String descricao;
    
}
