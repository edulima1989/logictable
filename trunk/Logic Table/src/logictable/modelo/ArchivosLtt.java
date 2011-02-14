/*
 * ArchivoLtt
 *
 * Ana Campoverde
 * Eduardo Lima
 * German Salas
 * Yanela Ríos
 * Carlos Vivanco
 *
 * Created on 15/07/2009, 11:16:29 PM
 *
 * Copyleft
 */

package logictable.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import logictable.vista.VtnPrincipal;

/**
 *
 * @author EDÚ
 */

/*
 * Operaciones con los archivos
 */

public class ArchivosLtt {
    private static JFileChooser fc;
    private static  File archivo;


 /**
 *
 * @ override "Método para guardar archivos"
 * @param String texto
 *
 */

    public static void guardar(String texto) throws IOException{
        fc=new JFileChooser();
        FiltroArchivo filtro =new FiltroArchivo();
        fc.setVisible(true);
        fc.addChoosableFileFilter(filtro);
        //fc.setSelectedFile(archivo);
         int opc=fc.showSaveDialog(null);
         if(opc==JFileChooser.APPROVE_OPTION){
                String path = fc.getSelectedFile().toString();
                System.out.println(path);

                FileWriter fr=null;
                BufferedWriter br;
                File f=new File(path+".ltt");
                fr=new FileWriter(f);
                br=new BufferedWriter(fr);
                br.write(texto);
                br.close();
                JOptionPane.showMessageDialog(fc, "El archivo se guardo con exito","Logic Table" ,JOptionPane.INFORMATION_MESSAGE);
                archivo=f;
         }

    }

 /**
 *
 * @ override ""Método para obtener el nombre del archivo
 * @return String
 *
 */

 public static String getNombreArchivo(){
          return archivo.getName();
        
 }

 /**
 *
 * @ override "Método para abrir un archivo"
 * @param boolean ant, boolean sig
 * @return ""
 *
 */

    public static String abrir(JFrame parent ) throws BadLocationException{

        fc=new JFileChooser();
        FiltroArchivo filtro =new FiltroArchivo();
        fc.setVisible(true);

        fc.addChoosableFileFilter(filtro);

        int opcion=fc.showOpenDialog(parent);
        if(opcion==javax.swing.JFileChooser.APPROVE_OPTION){
             archivo=fc.getSelectedFile();
         FileReader fr=null;
         BufferedReader br;
            try {
                fr = new FileReader(archivo);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(VtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
          br=new BufferedReader(fr);

            String str="",todo="";

        try{
        str=br.readLine();
        todo=str;
             while(!str.equals(null)){
                 str=br.readLine();
                 if(!str.equals(null))
                     todo+="\n"+str;

             }
        }catch(Exception ex){

        }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(VtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            return todo;
        }else
            return "";
    }
}
