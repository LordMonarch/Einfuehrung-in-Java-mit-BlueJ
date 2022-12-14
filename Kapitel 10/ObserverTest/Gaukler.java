

/**
 * Gaukler.java
 *
 * @author (your name) 
 * @version (a version number or a date)
 */


/**
 *
 */
public class Gaukler implements Beobachter
{  
    private java.util.Collection<Observer> observers = new java.util.ArrayList<Observer>();
    private int state = 0;
    public Gaukler(){}
    
   /**
    *
    */
    public void addObserver(Zuschauer observer){
        observers.add(observer);
    }

    /**
     *
     */
    public void removeObserver(Zuschauer observer){
        observers.remove(observer);
    }
    
    /**
     *
     */
    public void notifyObservers(){
        java.util.Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            ((Observer)iterator.next()).update(this);
        }
    }
    
    /**
     *
     */
    public int getState(){
        return this.state;
    }
    
    /**
     *
     */
    public void setState(int state){
        this.state = state;
        notifyObservers();
    }

}

/*
 *Source file generated by patternCoder for BlueJ Version 0.5.3.004.
 *For more info, please visit http://www.patterncoder.org.
 */