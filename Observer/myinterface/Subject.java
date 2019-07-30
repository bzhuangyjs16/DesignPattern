package Observer.myinterface;

public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}
