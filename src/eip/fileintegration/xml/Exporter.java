package eip.fileintegration.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/*
/**
 *
 * @author ernestoexposito
 */
public class Exporter {
    
    // the file system document name
    private String filename;
    // the DOM tree structure of the document to be created
    private Document doc;
    // the root of the DOM tree
    private Element rootElement;
    // various constant strings allowing to add XML declarations
    private static final String decl11 = "xmlns:xsi";
    private static final String decl12 = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String decl21 = "xsi:noNamespaceSchemaLocation";
    private static final String decl22 = "http://eexposit.perso.univ-pau.fr/content/xsd/Product.xsd";

    public Exporter(String filename) throws Exception {
        this.filename = filename;
        // builder factory pattern
        
        // the factory allows to create a document buidler
        
        // de document builder allows to create an empty DOM document
        
        // the Products element will be created and it will be referenced as the root of the DOM tree
        
        // the empty document will be added to the empty DOM tree. 
        
        //  Two attributes will be added to the Products element
        //  The xmlns:xsi attribut and its value
       
        //  The xsi:noNamespaceSchemaLocation attribute and its value
        
        
    }

    public void exportObject(Object object) {
        
        // Product element
        
        // ProductID element
        
        // ProductDescription element
        
        // ProductPrice element
        
        // ProductAmount element
        
        
    }
    
    public void close()
    {
         // transformer factory pattern
        
        // the factory allows to create a transformer
        
        
            
            // the transformer is configured to use the UTF-8 encoding type 
            
            // to indent the document
            
            // to produce an xml format
            
            // a DOMsource object is created based on the previously created DOM document
            
            // a Stream result is instanciated as an empty file using the provided filename
            
            // Finally the transformer will transform the DOM to an xml file. 
            
            
       
        
    }

}

