/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author REGO
 */
public class LeyendoExcel {
 
    private void leeFicheroExcel(String fileName){
        List cellDataList = new ArrayList();
        try{
            
//            POIFSFileSystem: ciclo de vida completo del sistema de archivos.
//            HSSFWorkbook: primer objeto construido.
//            HSSFSheet: hojas de cálculo.
//            HSSFRow: fila de una hoja de cálculo.
//            HSSFCell: celda en una fila de la hoja de cálculo.
            
            FileInputStream fileInputStream = new FileInputStream(fileName);
            POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);
            HSSFWorkbook libro = new HSSFWorkbook(fsFileSystem);
            HSSFSheet hoja = libro.getSheetAt(0);

            Iterator rowIterator = hoja.rowIterator();
            while (rowIterator.hasNext()){
                HSSFRow fila = (HSSFRow) rowIterator.next();
                Iterator iterator = fila.cellIterator();
                List cellTempList = new ArrayList();
                while (iterator.hasNext()){
                    HSSFCell hssfCell = (HSSFCell) iterator.next();
                    cellTempList.add(hssfCell);
                }
                cellDataList.add(cellTempList);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
