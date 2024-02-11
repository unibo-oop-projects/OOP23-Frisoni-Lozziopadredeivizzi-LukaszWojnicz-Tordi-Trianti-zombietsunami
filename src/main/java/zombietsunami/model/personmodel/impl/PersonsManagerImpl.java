package zombietsunami.model.personmodel.impl;

import java.util.ArrayList;
import java.util.List;

import zombietsunami.api.Controller;
import zombietsunami.api.Pair;
import zombietsunami.model.personmodel.api.Person;
import zombietsunami.model.personmodel.api.PersonsManager;

/**
 * Class that manages everthing about Persons
 */
public class PersonsManagerImpl implements PersonsManager{
    
    private List<Person> personList = new ArrayList<Person>();

    /**
     * Method that allows to retrieve a Person by its id
     * @param id the Person id
     * @return the Person
     */
    @Override
    public Person getPersonById(final int id) {
        for (Person person : personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    /**
     * Method that allows to remove a Person from the list
     * @param index index of the Person
     */
    @Override
    public void removePersonFromList(final int index) {
        personList.set(index, null);
    }

    /**
     * Sets the coordinates of the Person
     * @param index index of the Person in the list
     * @param x X coordinate
     * @param y Y coordinate
     */
    @Override
    public void setCoordinatesOfPersonInList(final int index, final int x, final int y) {
        personList.get(index).setX(x);
        personList.get(index).setY(y);
    }

    /**
     * Returns the Person list
     * @return the Person list
     */
    @Override
    public List<Person> getPersonList() {
        return personList;
    }

    /**
     * Returns the list of Person from the map
     * @return the complete list of the Person
     */
    @Override
    public void getPersonFromMap(final List<Integer> personlist, final List<Pair<Integer, Integer>> coords, final Integer strenght) {
        personList = new ArrayList<>();
        for(int i = 0; i < personlist.size(); i++) {
            if(personlist.get(i) == 1 && coords.get(i) != null) {
                Person person = new PersonImpl();

                person.setX(coords.get(i).getX());
                person.setY(coords.get(i).getY());
                person.setIncrease(Math.round(strenght * 0.5f));
                person.setId(i);

                personList.add(i, person);
            }else {
                personList.add(i, null);
            }
        }
    }

    /**
     * Adds a Person into the Person list
     * @param person the Person that needs to be added
     */
    @Override
    public void addPerson( final Person person) {
        if(person != null) {
            personList.add(person);
        }
    }

    /**
     * Method that allows to retrieve a Person by its X and Y coords
     * @param x the X coordinate of the Person
     * @param y the Y coordinate of the Person
     * @return the Person
     */
    @Override
    public Person getPersonByCoordinates(final int x, final int y) {
        for (Person person : personList) {
            if(person.getX() == x && person.getY() == y) {
                return person;
            }
        }
        return null;
    }

}