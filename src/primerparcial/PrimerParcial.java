/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;

import da.Jugador;
import da.ListaChile;
import da.ListaEspaña;

/**
 *
 * @author joser
 */
public class PrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaChile lc = new ListaChile();
        ListaEspaña le = new ListaEspaña();
        
        Jugador bravo = new Jugador("Claudio","Bravo","Portero",27,null);
        Jugador ismael = new Jugador("Ismael","Fuentes","Defensa",28,null);
        Jugador waldo = new Jugador("Waldo","Ponce","Defensa",27,null);
        Jugador mauricio = new Jugador("Mauricio","Isla","Defensa",21,null);
        Jugador pablo = new Jugador("Pablo","Contreras","Defensa",31,null);
        Jugador carlos = new Jugador("Carlos","Carmona","Mediocampo",23,null);
        Jugador alexis = new Jugador("Alexis","Sanchez","Delantero",21,null);
        Jugador vidal = new Jugador("Arturo","Vidal","Defensa",23,null);
        Jugador suazo = new Jugador("Humberto","Suazo","Delantero",29,null);
        Jugador jorge = new Jugador("Jorge","Valdivia","Mediocampo",26,null);
        Jugador mark = new Jugador("Mark","Gonzalez","Delantero",25,null);
        Jugador pinto = new Jugador("Miguel","Pinto","Portero",26,null);
        Jugador marco = new Jugador("Marco","Estrada","Mediocampo",27,null);
        Jugador matias = new Jugador("Matias","Fernandez","Mediocampo",24,null);
        Jugador jean = new Jugador("Jean","Beausejour","Mediocampo",26,null);
        Jugador fabian = new Jugador("Fabian","Orellana","Delantero",24,null);
        Jugador gary = new Jugador("Gary","Medel","Defensa",22,null);
        Jugador jara = new Jugador("Gonzalo","Jara","Defensa",24,null);
        Jugador fierro = new Jugador("Gonzalo","Fierro","Delantero",27,null);
        Jugador millar = new Jugador("Rodrigo","Millar","Mediocampo",28,null);
        Jugador tello= new Jugador("Rodrigo","Tello","Mediocampo",30,null);
        Jugador esteban = new Jugador("Esteban","Parades","Delantero",29,null);
        Jugador luis = new Jugador("Luis","Martin","Portero",27,null);
        
        lc.add(bravo); lc.add(ismael); lc.add(waldo); lc.add(mauricio); lc.add(pablo);
        lc.add(carlos); lc.add(alexis); lc.add(vidal); lc.add(suazo); lc.add(jorge); 
        lc.add(mark); lc.add(pinto); lc.add(marco); lc.add(matias); lc.add(jean); 
        lc.add(fabian); lc.add(gary); lc.add(jara); lc.add(fierro); lc.add(millar); 
        lc.add(tello); lc.add(esteban); lc.add(luis);
        
        
        Jugador iker = new Jugador("Iker","Casillas","Portero",29,null);
        Jugador javi = new Jugador("Javi","Martinez","Defensa",21,null);
        Jugador ramos = new Jugador("Sergio","Ramos","Defensa",24,null);
        Jugador silva = new Jugador("David","Silva","Mediocampo",21,null);
        Jugador alba = new Jugador("Jordi","Alba","Defensa",21,null);
        Jugador cesar = new Jugador("Cesar","Azpilicueta","Defensa",21,null);
        Jugador iniesta = new Jugador("Andres","Iniesta","Mediocampo",26,null);
        Jugador pedro = new Jugador("Pedro","Rodriguez","Madiocampo",22,null);
        Jugador alonso = new Jugador("Xabi","Alonso","Mediocampo",28,null);
        Jugador sergio = new Jugador("Sergio","Busquets","Mediocampo",21,null);
        Jugador costa = new Jugador("Diego","Costa","Delantero",21,null);
        
        le.add(iker); le.add(javi); le.add(ramos); le.add(alba); le.add(cesar); 
        le.add(iniesta); le.add(alonso); le.add(silva); le.add(sergio); le.add(costa); 
        le.add(pedro);
        
//        lc.ordernaEdad();
//        le.añadirMarcaje();
        
        lc.remove("Humberto");
        
        Jugador pinilla = new Jugador("Mauricio","Pinilla","Delantero",27,null);
        lc.add(pinilla);

        le.añadirMarcaje(lc);
        
        System.out.println(lc.printLineUp("1-4-3-3"));
//        System.out.println(le.printLineUp("1-4-5-1"));
        
//        System.out.println(lc.toString());
        System.out.println(le.toString());
        
        
        
        
        
    }
    
}
