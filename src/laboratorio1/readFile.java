/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import linkedList.LinkedList;

/**
 *
 * @author camilolopez
 */
public class readFile {

    private LinkedList listLinked;

    public readFile() {

        listLinked = new LinkedList();
        File file = new File("file.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                listLinked.addNode(Integer.parseInt(text));
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public LinkedList getListLinked() {
        return listLinked;
    }

    public void setListLinked(LinkedList listLinked) {
        this.listLinked = listLinked;
    }

}
