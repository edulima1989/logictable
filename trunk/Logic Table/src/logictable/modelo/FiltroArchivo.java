/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author EDÚ
 */
public class FiltroArchivo extends FileFilter{


    public boolean accept(File f){
        if (f.isDirectory()){
            return true;
        }

        String extension = f.getName();
        //podemos agregar mas extensiones
        if (extension.endsWith(".ltt")){
            return true;
        }
        return false;
    }

    public String getDescription() {
        //es la descripcion que vemos
        return "Archivos de texto (.ltt)";
    }

}
