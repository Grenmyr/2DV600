package Queue;

public class Element {	
    Element next;
    Object data;

    public Element(Object dataValue) {
        next = null;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }
    
    public void setNext(Element nextValue) {
        next = nextValue;
    }
}


