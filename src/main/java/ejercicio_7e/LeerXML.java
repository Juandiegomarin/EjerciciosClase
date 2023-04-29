/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7e;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Juan Diego
 */
public class LeerXML {
    
      public static void main(String[] args) throws JAXBException, 
            FileNotFoundException {

        // Crea el contexto JAXB 
        JAXBContext contexto = JAXBContext.newInstance(ListaFacturas.class);
        // Crea el objeto Unmarshaller
        Unmarshaller um = contexto.createUnmarshaller();

        // Llama al método de unmarshalling
        ListaFacturas lista = (ListaFacturas) um.unmarshal(new File("./xml/facturas.xml"));

        List<Factura> facturas = lista.getListaFacturas();

            facturas.forEach(System.out::println);
      }
}
