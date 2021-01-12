package com.company.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<EditorState>();


    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        if(!states.isEmpty()){
            var lastState = states.get(states.size()-1);
            states.remove(states.size()-1);
            return lastState;
        }
        return null;
    }

}
