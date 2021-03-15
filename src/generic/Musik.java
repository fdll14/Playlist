/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author fadil
 */
public class Musik {

    String path, fileName, fileSize, extention;

    public Musik(String p, String fn, String fs, String e) {
        this.path = p;
        this.fileName = fn;
        this.fileSize = fs;
        this.extention = e;
    }

    public String getPath() {
        return path;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getExtention() {
        return extention;
    }
}
