package Utils;

import ClasesObjeto.PagoRealizado;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class JasperGenerador {

    public static void generarJasper(Collection<PagoRealizado> pagoDatos){
        try{
            JasperReport jasperReport = null;
            JasperPrint jasperPrint = null;
            JasperDesign jasperDesign = null;
            Map paramaters = new HashMap();
            jasperDesign = JRXmlLoader.load("C:\\Users\\estudiante\\Documents\\proyectos\\MatriculaFxc\\src\\main\\resources\\Reporte\\ReporteMatricula.jrxml");
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, paramaters,
                    new JRBeanCollectionDataSource(pagoDatos));
            JasperExportManager.exportReportToPdfFile(jasperPrint,"target/ReporteMatricula.pdf");
            JasperViewer.viewReport(jasperPrint, false);
            //JasperPrintManager.printReport(jasperPrint,true); //Para imprimir el comprobante
        }catch(Exception ex){
            System.out.println("EXCEPTION: " + ex);
        }
    }
}
