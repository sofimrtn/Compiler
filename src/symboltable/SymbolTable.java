package symboltable;

import ast.definition.Definition;

import java.util.*;

public class SymbolTable {

    private int scope=0;
    private List<Map<String, Definition>> table;

    public SymbolTable()  {
        table = new ArrayList<Map<String, Definition>>();
        table.add(new HashMap<String, Definition>());
    }

    public void set() {
        this.scope++;
        //crear nuevo map.
        table.add(new HashMap<String, Definition>());
    }

    public void reset() {
        //nos cargamos el map
        table.remove(this.scope);
        this.scope--;
    }

    public boolean insert(Definition definition) {
        if(definition!=null && findInCurrentScope(definition.getName())==null) {
            definition.setScope(this.scope);
            table.get(this.scope).put(definition.getName(), definition);
            return true;
        }
        return false;
    }

    public Definition find(String id) {
        for(int i=this.scope; i>=0; i--){
            if(table.get(i).containsKey(id)){
                return table.get(i).get(id);
            }
        }
        return null;
    }

    public Definition findInCurrentScope(String id) {
        return table.get(this.scope).get(id);
    }
}