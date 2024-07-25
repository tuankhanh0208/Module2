package ProductStudent.Manager;

import ProductStudent.Model.School;

import java.util.ArrayList;

public class SchoolManager implements IManager<School> {
    ArrayList<School> listSchool = new ArrayList<>();
    @Override
    public void add(School school) {
        listSchool.add(school);
    }

    @Override
    public void edit(int id, School school) {
        int index = findById(id);
        listSchool.set(index,school);
    }

    @Override
    public void remove(int id) {
        int index = findById(id);
        listSchool.remove(index);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < listSchool.size(); i++) {
            if(listSchool.get(i).getId() == id){
                return i;
            }
        }
        return 0;
    }

    public ArrayList<School> findByName (String name){
        ArrayList<School> listSearch = new ArrayList<>();
        for (School school : listSchool){
            if(school.getName().toLowerCase().contains(name.toLowerCase())){
                listSearch.add(school);
            }
        }return listSearch;
    }

    @Override
    public ArrayList<School> fillAll() {
        return null;
    }
}
