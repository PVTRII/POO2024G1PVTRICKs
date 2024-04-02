package pe.edu.upeu.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.poo.cobjeto.Personas;

@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipiosPooApplication.class, args);
	           Personas person=new Personas();//aplicando objetos //para usar usar sus atributos y funciones//
                   person.setNombre("carlos");
                   person.setEdad(20);
                   person.edad=38;
                   System.out.print("yo soy "+person.getNombre()+" y tengo "+person.getEdad()+" años");
                   
                   
                      
        }

}
