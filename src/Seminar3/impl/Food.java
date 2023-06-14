package Seminar3.impl;

import Seminar3.impl.Companent;

import java.util.Iterator;
import java.util.List;

public abstract class Food implements Iterator<Companent> {
    private List<Companent> component;
    private int index;

    public Food(List<Companent> component) {
        this.component = component;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { // методы итератора проверяющий есть ли следующий элемент
//        if (index < component.size())
//            return true;
//        else return false;
        return index<component.size(); // проверяем количество компонентов от длины масиива List<Component>
    }

    @Override
    public Companent next() { // методы итератора как получить следующий элемент

        return component.get(index++);
    }

}
