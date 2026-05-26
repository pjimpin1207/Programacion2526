package Tema9.Examen;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
public class Evaluacion5 {
    public static void main(String[] args) throws Exception {
// --- 1. LECTURA Y PARSEO DEL XML ---
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
// Parsea el archivo y lo carga en memoria como un objeto Document
        Document doc = builder.parse(new File("usuarios.xml"));
// --- 2. MANIPULACIÓN DEL ÁRBOL DOM ---
// Obtenemos el elemento raíz del XML
        Element raiz = doc.getDocumentElement();
// Creamos una nueva etiqueta llamada <usuario>
        Element nuevoUsuario = doc.createElement("usuario");
// Conteniendo el texto “Carlos”
        nuevoUsuario.setTextContent("Carlos");
// Añadimos el nuevo usuario como hijo de la raíz
        raiz.appendChild(nuevoUsuario);
// --- 3. ESCRITURA / TRANSFORMACIÓN DE VUELTA A ARCHIVO ---
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
// Definimos el origen (el árbol DOM) y el destino (el archivo físico)
        DOMSource origen = new DOMSource(doc);
        StreamResult destino = new StreamResult(new File("usuarios.xml"));
// Realiza la exportación final
        transformer.transform(origen, destino);
        System.out.println("XML modificado y guardado con éxito.");
    }
}