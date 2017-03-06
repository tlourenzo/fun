package org.academiadecodigo.bytenavoid.util;


/**
 * Created by codecadet on 02/03/17.
 */
public enum FileType {

    CLIENT("resources/clients.tmp"),
    FACILITY("resources/facilities.tmp"),
    RESERVATION("resources/reservations.tmp");


    String filename;

    FileType(String filename){
        this.filename = filename;
    }

    public String getFilename(){

        //TODO prepare path to deploy on jar Builder
        //TODO handle exceptions on URI

        //String path = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        return filename;
    }

}
