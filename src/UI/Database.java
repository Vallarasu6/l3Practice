package UI;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    HashMapHandler hashMapHandler = new HashMapHandler();
static Connection con = null;
public Database(){
    try {
        if(con==null){
            con = DriverManager.getConnection("jdbc:mysql://localhost/valla", "root", "vallaK@6");
        }
    }catch (SQLException throwables) {
        throwables.printStackTrace();
    }
}
public void insertRegister(ArrayList<Register> registerArrayList) throws SQLException {
    PreparedStatement st = null;
    int size = registerArrayList.size();
    try{
        String sql = "INSERT INTO register (name,email,mobile,password,amount) VALUES(?,?,?,?,?)";
        st = con.prepareStatement(sql);
        for (int i=0;i<size;i++){
            Register register = registerArrayList.get(i);
            st.setString(1, register.getUserName());
            st.setString(2,register.getEmail());
            st.setLong(3,register.getMobile());
            st.setString(4, register.getPassword());
            st.setLong(5,register.getAmount());
        }
        st.execute();
        st.close();
    }catch (Exception e){
        System.out.println("Error message: " + e.getMessage());
    }

}
public HashMap<String,Register> uploadData(){
    Statement st = null;
    ResultSet rs = null;
    HashMap<String,Register> registerHashMap = new HashMap<>();
    try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * from register");
        while (rs.next()) {
            Register register;
            String name = rs.getString("name");
            String email = rs.getString("email");
            Long mobile = rs.getLong("mobile");
            String password = rs.getString("password");
            Long amount = rs.getLong("amount");
            register = new Register(name,email,mobile,0,password,amount,0);
            registerHashMap.put(email,register);
        }
        //System.out.println(hashMapHandler.returnRegister());
    }catch (Exception e){
        System.out.println("Error message: " + e.getMessage());
    }
    return registerHashMap;
}


}
