/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanager.object;

/**
 *
 * @author JMorenoM
 */
public class School {
    private String _name;
    
    public School(String name){
        this._name = name;        
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param name the _name to set
     */
    public void setName(String name) {
        this._name = name;
    }
    
    @Override
    public String toString() {
        return "School{ Name:" + getName() +" }";
    }
    
}
