package mongoDB;


import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;


public class MainClass {

    private MongoClient mongoClient;
    private MongoDatabase db;


    public static void main(String[] args) {
        MainClass m  = new MainClass();
        m.mongoConnection();
        m.test();
    }
    //
    private void mongoConnection(){
        try {
            mongoClient = new MongoClient("localhost", 27017);
            db = mongoClient.getDatabase("doannh");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void test(){
        MongoCollection<Document> collection = db.getCollection("table1");
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Collection myCollection selected successfully");
    }

}
