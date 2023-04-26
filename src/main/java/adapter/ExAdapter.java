package adapter;

import java.util.ArrayList;

public class ExAdapter {
    public static void main(String[] args) {
        ArrayList<Transportation> transportations = new ArrayList<Transportation>();
        transportations.add(new Bus("마을버스"));
        transportations.add(new Taxi("카카오 택시"));

        transportations.forEach(Transportation::runnable);
    }
}
