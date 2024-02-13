package zombietsunami.model.personmodel.api;

import java.util.List;

import zombietsunami.Pair;

/**
 * Interface whose purpose is to manage all Persons
 */
public interface PersonsManager {

    /**
     * Removes the "index" Person from the list
     * @param index the index of the Person in the list
     */
    void removePersonFromList(int index);

    /**
     * Sets the coordinates of the "index" Person
     * @param index index of the Person in the list
     * @param x X coordinate
     * @param y Y coordinate
     */
    void setCoordinatesOfPersonInList(int index, int x, int y);
    
    /**
     * Returns the Person list
     * @return the Person list
     */
    List<Person> getPersonList();

    /**
     * Returns the list of Person from the map
     */
    void getPersonFromMap(List<Integer> personlist, List<Pair<Integer, Integer>> coords, Integer strenght);

    /**
     * Adds a Person into the Person list
     * @param person the Person that needs to be added
     */
    void addPerson(Person person);

    /**
     * Method that allows to retrieve a Person by its id
     * @param id the Person id
     * @return the Person
     */
    Person getPersonById(final int id);

    /**
     * Method that allows to retrieve a Person by its X and Y coords
     * @param x the X coordinate of the Person
     * @param y the Y coordinate of the Person
     * @return the Person
     */
    Person getPersonByCoordinates(final int x, final int y);
}
