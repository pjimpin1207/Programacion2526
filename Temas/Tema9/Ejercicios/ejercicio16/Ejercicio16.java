package Tema9.Ejercicios.ejercicio16;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Ejercicio16 {
    public static void main(String[] args) {
        try {
            // === FASE 1: Inicializar el documento vacío ===
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Creamos un documento en blanco en memoria
            Document documento = builder.newDocument();

            // === FASE 2: Construir el árbol de Nodos/Elementos ===

            // Creación del elemento raíz <videojuego>
            Element raiz = documento.createElement("videojuego");
            // Acoplamos la raíz directamente al nodo principal del documento
            documento.appendChild(raiz);

            // Creación del elemento <pantalla>
            Element pantalla = documento.createElement("pantalla");
            // Asignación de su atributo estructurado
            pantalla.setAttribute("resolucion", "1920x1080");
            // Inserción del texto interno del nodo
            pantalla.setTextContent("true");

            // ¡Crucial! Colgamos el nodo pantalla del elemento raíz
            raiz.appendChild(pantalla);

            // Creación del elemento <audio>, asignarle atributo y texto interno
            Element audio = documento.createElement("audio");
            audio.setAttribute("volumen", "80");
            audio.setTextContent("false");

            // Añadimos el nodo audio al árbol enganchándolo también a la raíz
            raiz.appendChild(audio);

            // === FASE 3: El "Transformer" (Exportar memoria a archivo físico) ===
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Truco: Activar la indentación para que el XML no salga en una sola línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // Definir el origen (nuestro árbol DOM) y el destino (el archivo de texto)
            DOMSource origen = new DOMSource(documento);
            StreamResult destino = new StreamResult(new File("juego_config.xml"));

            // Serialización real del documento volcando los datos al archivo
            transformer.transform(origen, destino);

            System.out.println("¡Archivo XML generado con éxito de manera estructurada!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}