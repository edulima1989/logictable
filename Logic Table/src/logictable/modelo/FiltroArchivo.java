/*
 * FiltroArchivo
 *
 * Ana Campoverde
 * Eduardo Lima
 * German Salas
 * Yanela Ríos
 * Carlos Vivanco
 *
 * Created on 15/07/2009, 11:16:29 PM
 *
 * Copyright
 */

package logictable.modelo;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author EDÚ
 */

/*
 *Para la extensión de archivos
 */

public class FiltroArchivo extends FileFilter{
    
/**
 *
 * @ override
 * @param File f
 * @return boolean
 *
 */

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
