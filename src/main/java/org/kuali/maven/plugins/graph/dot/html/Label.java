package org.kuali.maven.plugins.graph.dot.html;

public class Label<T> {
    T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}