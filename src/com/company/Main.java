package com.company;

import com.company.abstract_factory.AbstractShapeFactory;
import com.company.abstract_factory.FactoryProvider;
import com.company.abstract_factory.Shape;
import com.company.factory.Player;
import com.company.factory.PlayerFactory;
import com.company.momento.Editor;
import com.company.momento.History;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World");
        //User user = new User("Nafiz");
        //user.sayHello();

        //The Memento Design Pattern
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        //history.push(editor.createState());

        editor.restore(history.pop());
        editor.restore(history.pop());
        //editor.undo();

        System.out.println(editor.getContent());


        //The Factory Design Pattern
        PlayerFactory playerFactory =  new PlayerFactory();
        Player player1 = playerFactory.getPlayer("Batsman");
        player1.getStats();

        Player player2 = playerFactory.getPlayer("Bowler");
        player2.getStats();


        //The Abstract Factory Design Pattern
        AbstractShapeFactory abstractShapeFactory = FactoryProvider.getAbstractFactory(true);

        Shape shape1 = abstractShapeFactory.getShape("Square");

        AbstractShapeFactory abstractShapeFactory1 = FactoryProvider.getAbstractFactory(false);
        Shape shape2 = abstractShapeFactory1.getShape("Square");

        System.out.println(shape1.draw());
        System.out.println(shape2.draw());
    }
}
