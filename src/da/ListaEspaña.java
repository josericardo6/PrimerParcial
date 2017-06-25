/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

/**
 *
 * @author joser
 */
public class ListaEspaña {
    
    private Nodo cabeza;
    private int size;

    public ListaEspaña() {
        
        this.cabeza = null;
        this.size = 0;
       
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int Size() {
        return size;
    }

    /**
     * <h1>toString</h1>
     * <p>
     * Metodo que imprime la lista de los jugadores guardados</p>
     *
     * @return String: Lista de jugadores y caracteristicas
     */
    @Override
    public String toString(){
        
        Nodo aux = cabeza; //Inicializa el nodo auxiliar con el valor de la cabeza
        String resultado = "SELECCION DE ESPAÑA \n\n";
        int cont = 1;
        
        for(int i = 0; i < size; i++){
            
            resultado += cont + ") "
                    +"Jugador: " + aux.getPlayer().getNombre()
                    + " " + aux.getPlayer().getApellido() 
                    + " / " + aux.getPlayer().getEdad()
                    + " años / " + aux.getPlayer().getPosicion()
                    + " / marca asignada: " + aux.getPlayer().getMarca()
                    + "\n"; 
            
            aux = aux.getSig(); 
            cont++;
        }
        
        return resultado;
    }
    
    /**
     * <h1>add</h1>
     * <p>
     * Metodo que añade un jugador a la lista.</p>
     *
     * @param player
     * @return boolean: true/false
     */
    public boolean add(Jugador player){
        
        Nodo nuevo = new Nodo(player);
        
        if(cabeza == null){
            cabeza = nuevo;
        }else if (player.getPosicion().compareTo(cabeza.getPlayer().getPosicion()) > 0) {
            nuevo.setSig(cabeza);
            cabeza.setAnt(nuevo);
            cabeza = nuevo;
            size++;
        } else {
            Nodo aux = cabeza;
            Nodo aux2 = cabeza.getSig();
            while (aux2 != null) {
                if (player.getPosicion().compareTo(aux2.getPlayer().getPosicion()) > 0) {
                    break;
                }
                aux = aux2;
                aux2 = aux2.getSig();
            }
            nuevo.setSig(aux.getSig());
            aux.setSig(nuevo);
            size++;
        
        }
    
        return true;
        
    }
    

    
    /**
     * <h1>ordenarPosicion</h1>
     * <p>
     * Metodo que oderna la lista segun la posicion de los jugadores.</p>
     *
     * @return boolean: true/false
     */
    public boolean ordernaPosicion(){
        
        
        return true;
    }
    
    /**
     * <h1>añadirMarcaje</h1>
     * <p>
     * Metodo que añade una marca a cada jugador.</p>
     *
     * @param lc
     * @return boolean: true/false
     */
    public boolean añadirMarcaje(ListaChile lc){
        
        Nodo aux = cabeza;
        Nodo aux2 = lc.getCabeza();
        
        for(int i = 0; i < size; i++){
  
            for(int j = 0; j < 23;j++){
                
//                if(i != 0 && aux.getAnt().getPlayer().getMarca().equals(aux2.getPlayer().getNombre())){
//                    
//          
//                }
                
                if(aux.getPlayer().getPosicion().equals(aux2.getPlayer().getPosicion())){
                    
                    aux.getPlayer().setMarca(aux2.getPlayer().getNombre());
                    
                }
                
                aux2 = aux2.getSig();
                
            }
            
            aux = aux.getSig();
            aux2 = lc.getCabeza();
        }
        
        return true;
    }
    
    public String printLineUp(String lineUp){
        
        int por = Integer.parseInt(lineUp.substring(0,1));
        int def = Integer.parseInt(lineUp.substring(2,3));
        int med = Integer.parseInt(lineUp.substring(4,5));
        int dela = Integer.parseInt(lineUp.substring(6));
        
        int totalFormacion = por+def+med+dela;
        
        String alineacion = "";
        
        if(totalFormacion > 11 || totalFormacion < 11){
            
            System.out.println("ALINEACION ERRONEA");
            
        }else if(por != 1){
            
            System.out.println("SOLO PUEDE HABER UN PORTERO EN LA PORTERIA");
            
            }else{

                ListaEspaña porteros = new ListaEspaña();
                ListaEspaña defensas = new ListaEspaña();
                ListaEspaña mediocampos = new ListaEspaña();
                ListaEspaña delanteros = new ListaEspaña();

                Nodo aux = cabeza;
                int cont = 0;
                for(int i = 0; i < size; i++){

                    switch(aux.getPlayer().getPosicion()){
                        case "Portero":
                            porteros.add(aux.getPlayer());
                            break;
                        case "Defensa":
                            defensas.add(aux.getPlayer());
                            cont++;
                            break;
                        case "Mediocampo":
                            mediocampos.add(aux.getPlayer());
                            break;
                        case "Delantero": 
                            delanteros.add(aux.getPlayer());
                            break;
                    }
                    aux = aux.getSig();
                }

                System.out.println(cont);
                
                Nodo auxPor = porteros.getCabeza();

                for(int i = 1; i <= por; i++){ // PORTEROS

                    alineacion +=  auxPor.getPlayer().getNombre() + "\n\n";
                    auxPor = auxPor.getSig();

                }

                Nodo auxDef = defensas.getCabeza();

                for(int i = 1; i <= def; i++){ // DEFENSAS

                    alineacion +=  auxDef.getPlayer().getNombre() + " - ";
                    auxDef = auxDef.getSig();
                }

                alineacion = alineacion.substring(0, alineacion.length()-2);
                alineacion += "\n\n";

                Nodo auxMed = mediocampos.getCabeza();

                for(int i = 1; i <= med; i++){ // MEDIOCAMPOS

                    alineacion +=  auxMed.getPlayer().getNombre() + " - ";
                    auxMed = auxMed.getSig();
                }

                alineacion = alineacion.substring(0, alineacion.length()-2);
                alineacion += "\n\n";

                Nodo auxDela = delanteros.getCabeza();

                for(int i = 1; i <= dela; i++){ // DELANTEROS

                    alineacion +=  auxDela.getPlayer().getNombre() + " - ";
                    auxDela = auxDela.getSig();
                }

                System.out.println("\n");

            }//fin else
        
        alineacion = alineacion.substring(0, alineacion.length()-2);
        alineacion += "\n\n";
        
        return alineacion;
    }
    
}
