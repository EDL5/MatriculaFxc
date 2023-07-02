package Jasper;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Jasper {

    public static void main (String[] str){
        try{
            JasperReport jasperReport = null;
            JasperPrint jasperPrint = null;
            JasperDesign jasperDesign = null;
            Map paramaters = new HashMap();
            jasperDesign = JRXmlLoader.load("C:\\Users\\Fabrizio\\Downloads\\MatriculaFxc-main\\src\\main\\java\\Reporte\\ReporteMatricula.jrxml");
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, paramaters,
                    new JRBeanCollectionDataSource(Datos.generaDatosPersona()));
            JasperExportManager.exportReportToPdfFile(jasperPrint,"target/ReporteMatricula.pdf");
            JasperViewer.viewReport(jasperPrint);
        }catch(Exception ex){
            System.out.println("EXCEPTION: " + ex);
        }
    }
}
