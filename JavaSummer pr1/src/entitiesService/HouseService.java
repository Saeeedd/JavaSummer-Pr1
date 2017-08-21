package entitiesService;
import entities.*;
import java.util.*;

public class HouseService {
    //constructor
    public HouseService(House _house) {
        house = _house;
    }

    //attributes
    private House house;
    private Vector<House> allHouses;

    //getters
    public House getHouse() {
        return house;
    }

    public Vector<House> getAllHouses() {
        return allHouses;
    }

    //setters
    public void setHouse(House _house) {
        house = _house;
    }

    public void setAllHouses(Vector<House> _allHouses) {
        allHouses = _allHouses;
    }

    //methods
    public void getData(String fileName) {

    }

    public void setData() {

    }
}
