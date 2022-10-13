package com.abb;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = new Human[0];
    }

    public void addChild (Human human)
    {
        Human[] oldChildren = children;

        children = new Human[children.length + 1];

        for (int i = 0; i < oldChildren.length; i++)
            children[i] = oldChildren[i];

        children[children.length - 1] = human;
    }

    public void deleteChild (int index)
    {
        Human[] oldChildren = children;

        children = new Human[children.length - 1];

        int j = 0;
        for (int i = 0; i < oldChildren.length; i++)
        {
            if (i != index) {
                children[j] = oldChildren[i];
                j++;
            }
        }
    }

    public int countFamily ()
    {
        return children.length + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Family))
            return false;

        Family family = (Family) o;

        if (!family.mother.equals(this.mother))
            return false;
        if (!family.father.equals(this.father))
            return false;
        if (family.children.length != this.children.length)
            return false;
        for (int i = 0; i < family.children.length; i++)
        {
            if (!family.children[i].equals(this.children[i]))
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
