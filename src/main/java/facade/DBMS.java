package facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> db = new HashMap<String, Row>();

    public DBMS() {
        db.put("robert", new Row("Robert","1992-02-19","robert123@gmail.com"));
        db.put("kane", new Row("Kain", "1980-12-12", "eng1@naver.com"));
        db.put("jessi", new Row("Jessi","1996-09-30", "abcd23@yajop.com"));
    }

    public Row query(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
