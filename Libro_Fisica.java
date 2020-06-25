/*
 * EXAMEN_PARCIAL_I

Diseñe, modele mediante el diagrama UML e implemente una clase Libro_Fisica que
contenga los siguientes atributos: código de tipo entero, titulo de tipo String,
autor de tipo String, anio_edicion de tipo entero.
Diseñe e implemente un único constructor que permita gestionar los datos de la
clase, además, implemente sus respectivos métodos get() y set() correspondientes 
para cada atributo; además, implemente el método toString() para mostrar la información
relativa a la clase Libro_Fisica.
En la clase principal main(), diseñe e implemente 3 objetos que lleven el nombre 
de la clase Libro_Fisica, con valores considerados para la presente aplicación y 
muestre por pantalla. Finalmente, implemente la versión de prueba en Git Hub-Atom.
 */
package Libro_FisicaApp;

/**
 *
 * @author ALAMCHE CRISTIAN
 */
public class Libro_Fisica {
    //ATRIBUTOS
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
    
    //CONSTRUCTORES
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnio_Edicion){
        
        codigo=pCodigo;
        titulo=pTitulo;
        autor=pAutor;
        anio_edicion=pAnio_Edicion;
    }
     //METODOS
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
     public String getTitulo(){
         return titulo;
     }
     public void setTitulo(String titulo){
         this.titulo=titulo;
     }
     public String getAutor(){
         return autor;
      }
     public void setAutor(String autor){
         this.autor=autor;
     }
     public int getAnio_Edicion(){
         return anio_edicion;         
     }
     public void setAnio_Edicion( int anio_edicion){
         this.anio_edicion=anio_edicion;
     }
     @Override
     public String toString(){
         return "El libro de fisica titulado : "+titulo+ "con código:  "+codigo+ " su autor es: "
                 + " "+autor+" Su año de Edicion es : "+anio_edicion+"-";
     }
}

class Libro_FisicaApp{
    public static void main(String[] args){
         //creamos losobjetos
         
         Libro_Fisica libro1=new Libro_Fisica(1324, "MECANICA VECTORIAL PARA INGENIEROS"," Jhonson Beer", 2010);
         Libro_Fisica libro2=new Libro_Fisica(6152, "FISICA FUNDAMENTAL ","Zambrano", 2006);
          Libro_Fisica libro3=new Libro_Fisica(0032, "DINAMICA "," Hibbeler", 2001);
         //mostramos su estado
         System.out.println(libro1);
         System.out.println(libro2);
         System.out.println(libro3);
         
    }
}