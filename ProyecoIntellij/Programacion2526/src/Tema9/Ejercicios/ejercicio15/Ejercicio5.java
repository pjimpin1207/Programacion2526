package Tema9.Ejercicios.ejercicio15;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            // 1. Crear la factoría y el constructor de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 2. Parsear el archivo XML
            File archivo = new File("config.xml");
            Document documento = builder.parse(archivo);

            // Normaliza el árbol XML (elimina nodos de texto vacíos adyacentes)
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>) 
            Element raiz = documento.getDocumentElement();
            System.out.println("Elemento raíz: " + raiz.getNodeName());

            // 4. Obtener los hijos de <base-datos>
            NodeList listaBaseDatos = documento.getElementsByTagName("base-datos");
            // Tomamos el primero de la lista (índice 0) 
            Node nodoBaseDatos = listaBaseDatos.item(0);

            // 5. Vamos a ver sus hijos directos
            NodeList hijos = nodoBaseDatos.getChildNodes();
            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());

            System.out.println("--- Listando hijos ---");
            for (int i = 0; i < hijos.getLength(); i++) {
                Node hijo = hijos.item(i);

                // Filtrado para obtener solo los elementos reales
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) hijo;
                    System.out.println("ELEMENTO REAL -> Nombre: " + elemento.getNodeName() +
                            " | Valor: " + elemento.getTextContent());
                } else {
                    // Muestra los nodos que no son etiquetas (espacios, saltos de línea, etc.)
                    System.out.println("Hijo " + i + " -> Tipo: " + hijo.getNodeType() +
                            " (TEXT_NODE/Otros) | Nombre: " + hijo.getNodeName());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}