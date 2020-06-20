/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author garci
 */
public class compiler {
     public String filepathC;
    
    public compiler(String filepath) {
        this.filepathC = filepath;
    }
    
    public String Compile(){
        return filepathC;
    }
}
