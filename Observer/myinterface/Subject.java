package day02.myinterface;

public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}
