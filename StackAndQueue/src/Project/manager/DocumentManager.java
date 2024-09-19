package Project.manager;

import Project.Model.Book;
import Project.Model.Document;
import Project.Model.Manazine;
import Project.Model.New;

import javax.print.Doc;
import java.util.ArrayList;

public class DocumentManager implements IManager<Document>{
    ArrayList<Document> documentArrayList = new ArrayList<Document>();

    @Override
    public void add(Document document){
        documentArrayList.add(document);
    }

    @Override
    public void remove(int id) {
        int index = findIndexId(id);
        documentArrayList.remove(index);
    }

    @Override
    public void update(Document document, int id) {
        int index = findIndexId(id);
        documentArrayList.set(index,document);
    }

    @Override
    public int findIndexId(int id) {
        for (int i=0;i<documentArrayList.size();i++){
            if(documentArrayList.get(i).getId() == id){
                return 1;
            }
        }
        return 0;
    }
    public Document findDocumentById(int id){
        for (Document document : documentArrayList){
            if(document.getId() == id){
                return document;
            }
        }
        return null;
    }
    public ArrayList<Book> getBook(){
        ArrayList<Book> books = new ArrayList<>();
        for (Document document : documentArrayList){
            if (document instanceof Book){
                books.add((Book) document);
            }
        }
        return books;
    }
    public ArrayList<New> getNews(){
        ArrayList<New> news = new ArrayList<>();
        for (Document document :documentArrayList){
            if (document instanceof New){
                news.add((New) document);
            }
        }
        return news;
    }
    public ArrayList<Manazine> getManazines(){
        ArrayList<Manazine> manazines = new ArrayList<>();
        for (Document document : documentArrayList){
                if (document instanceof Manazine){
                    manazines.add((Manazine) document);
                }
            }
            return manazines;
            }

    @Override
    public ArrayList<Document> getAll() {
        return documentArrayList;
    }
}
