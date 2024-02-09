/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MCTech
 */
public class Barcode {
    public static void main(String[] args) {
        
        try {
            
            JasperReport jr = JasperCompileManager.compileReport("src/reports/Blank_A4.jrxml");
            
            HashMap parameters = new HashMap();
            
            Vector v = new Vector();
            v.add(new X("12345"));
            v.add(new X("678910"));
            v.add(new X("118841"));
            v.add(new X("98489"));
            v.add(new X("4848"));
            
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(v);
            
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSource);
            
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
