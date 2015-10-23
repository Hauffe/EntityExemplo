/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog4.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author alexandre.hauffe
 */
@Entity
public class Automovel {

    @Id
    private long id;
    private String placa;
    private int anoFabricação;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }
}
