package com.ithome.homeexercisetest.model;

public abstract class BaseModel {

    public abstract String table();

//    public String idField() { return "id"; }
//
//    public boolean exists(long id) {
//        // don't build queries this way in real life though!
//        System.out.println("SELECT count(*) FROM " + table() + " WHERE " + idField() + " = " + id);
//        return true;
//    }

//    protected static boolean exists(String table, long id) throws Exception
//    {
//        Db db = Util.getDb();
//        Query q = db.query();
//        q.select( idField ).whereLong(idField, id).limit(1).get(table);
//
//        return q.hasResults();
//    }
}
