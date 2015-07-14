package com.edu.ifpb.dac.dacademico.entidades.dominio;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Entity
@SequenceGenerator (name = "default_gen", sequenceName = "sq_admin")
public class Administrador extends Pessoa{

}
