import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Niveau {

	//ATTRIBUTS
	
	private int numero;					//le num�ro du niveau
	private int nbVerrou ;				//le nombre de v�rrou et de boutton que le coffre a.
	private Vector<Verrou> verrous;		//la liste des v�rrous du niveau
	private Vector<Bouton> boutons;		//la liste des boutons du niveau
	final String NOMFICHIER = "listeNiveau.xml";
	
	//METHODES 
	
	public Niveau(int numero){

		this.numero = numero;
		lireFichier(numero);

	}
	
	public void lireFichier(int numero){
		
        // Etape 1 : r�cup�ration d'une instance de la classe "DocumentBuilderFactory"
       	
		File listeNiveaux = new File(NOMFICHIER);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            	
        try {
            
            //Etape 2 : cr�ation d'un parseur
            
        	DocumentBuilder builder = factory.newDocumentBuilder();
			
		    // Etape 3 : cr�ation d'un Document
		    
		    Document document= (Document) builder.parse(listeNiveaux);
		    
		    // Etape 4 : r�cup�ration de l'Element racine
		    
		    Element racine = (document).getDocumentElement();

		    // Etape 5 : r�cup�ration du niveau
		    	
		    	// dans le fichier racine = levels
		    
		    NodeList level = racine.getChildNodes();
		    int nblevel = level.getLength();
			
		    Element niveauActuel = null;
		    
		    for (int i = 0; i<nblevel; i++) {
		        if(level.item(i).getNodeType() == Node.ELEMENT_NODE) {
		            niveauActuel = (Element) level.item(i);
					if (Integer.parseInt(niveauActuel.getAttribute("id")) == numero){
						break;
					}else{
						niveauActuel = null;
					}
		        }
		    }
		    
		    //Etape 6 : r�cup�ration des verrous et boutons
		    
		    if(niveauActuel != null){
		    	
		    	NodeList verrous =  niveauActuel.getElementsByTagName("verrou");
		    	int nbverrou = verrous.getLength();
		    	for(int i = 0;i<nbverrou;i++){
		    		if(verrous.item(i).getNodeType() == Node.ELEMENT_NODE){
		    			//String etat = verrous.getContentText();
		    		}
		    	}
		    }
		    
        }
		catch (FileNotFoundException e) {
			System.err.println("Pas de fichier disponible");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.err.println("lecture impossible");
			e.printStackTrace();
		} 
        catch (ParserConfigurationException e) {
			e.printStackTrace();
		} 
        catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
}
