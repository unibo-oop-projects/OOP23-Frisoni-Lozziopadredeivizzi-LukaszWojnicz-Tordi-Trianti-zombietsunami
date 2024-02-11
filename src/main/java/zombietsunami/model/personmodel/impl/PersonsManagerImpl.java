package zombietsunami.model.personmodel.impl;

import java.util.ArrayList;
import java.util.List;

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
    public Person getPersonById(final int id) {
        for (Person person : personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public void removePersonFromList(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePersonFromList'");
    }

    @Override
    public void setCoordinatesOfPersonInList(int index, int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCoordinatesOfPersonInList'");
    }

    @Override
    public List<Person> getPersonList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonList'");
    }

    @Override
    public void getPersonFromMap(List<Integer> personlist, List<Pair<Integer, Integer>> coords, Integer strenght) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonFromMap'");
    }

    @Override
    public void addPerson(Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPerson'");
    }

    @Override
    public Person getPersonByCoordinates(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonByCoordinates'");
    }

}
