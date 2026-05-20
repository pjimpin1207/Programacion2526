package Tema9.Ejercicios.ejercicio17;

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
import java.util.ArrayList;
import java.util.List;

public class Ejercicio17 {

    public static void main(String[] args) {
        // crear la lista de personas
        List<Persona> contactos = new ArrayList<>();
        contactos.add(new Persona("Ana García López","Calle Mayor 12, 29001 Málaga","600111222"));
        contactos.add(new Persona("Carlos Ruiz Pérez","Avenida de Andalucía 45, 29004 Málaga","611333444"));
        contactos.add(new Persona("María Torres Sánchez","Plaza de la Constitución 3, 29015 Málaga","622555666"));
        contactos.add(new Persona("Luis Fernández Mora","Calle Larios 8, 29005 Málaga","633777888"));
        contactos.add(new Persona("Laura Martínez Díaz","Paseo del Parque 2, 29016 Málaga","644999000"));

        // Construir el documento XML en memoria
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc= builder.newDocument();

            // Nodo raíz <contactos>
            Element raiz = doc.createElement("contactos");
            doc.appendChild(raiz);

            // Un nodo <persona> por cada objeto de la lista
            for (Persona p : contactos) {
                Element persona = doc.createElement("persona");
                raiz.appendChild(persona);

                // <nombre>
                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(p.getNombre()));
                persona.appendChild(nombre);

                // <direccion>
                Element direccion = doc.createElement("direccion");
                direccion.appendChild(doc.createTextNode(p.getDireccion()));
                persona.appendChild(direccion);

                // <telefono>
                Element telefono = doc.createElement("telefono");
                telefono.appendChild(doc.createTextNode(p.getTelefono()));
                persona.appendChild(telefono);
            }
            
            // Serializar el DOM a fichero XML
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("contactos_.xml"));

            transformer.transform(source, result);
            System.out.println("Fichero contactos_.xml generado correctamente");

            // mostrar los contactos guardados
            System.out.println("\nContactos guardados:");
            for (Persona p : contactos) {
                System.out.println("  • " + p);
            }

        } catch (Exception e) {
            System.err.println("Error al generar el XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}