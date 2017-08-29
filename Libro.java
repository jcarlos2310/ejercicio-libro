public class Libro{

     private String titulo;
     private String autor;
     


     
     public  Libro(String cadTitulo,String cadAutor){
          titulo=cadTitulo;
          autor=cadAutor;

        }
     public void dimeTitulo(String titulo)   {
        System.out.println("el titulo es:"+titulo);
        }
     public void dimeAutor(String autor)   {
        System.out.println("el autor es:"+autor);
        }         
}


