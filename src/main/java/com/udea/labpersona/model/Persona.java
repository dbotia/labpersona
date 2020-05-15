
package com.udea.labpersona.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel(description="Entidad de Datos de la Persona")
@Entity
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(notes="Id automatico generado en la BD")
    @Column(name="idperson")
    private Long idPerson;
    
    @ApiModelProperty(notes="Atributo Nombre de la PErsona")
    @Column(name="firstname", nullable=false,length=80)
    private @NonNull String firstName;

    @ApiModelProperty(notes="Atributo Apellido de la PErsona")
    @Column(name="lastname", nullable=false,length=80)
     private @NonNull String lastName;
    
    @ApiModelProperty(notes="Atributo email de la PErsona")
    @Column(name="email", nullable=false,length=80)
    private @NonNull String email;
    
    
    
}
