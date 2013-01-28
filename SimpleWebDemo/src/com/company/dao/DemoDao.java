package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.company.model.Student;

public class DemoDao {

	public Connection getConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:d:/my.db");
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
    public void initializeDB(){
    	try {
    		Connection conn = getConnection();
    		Statement stat = conn.createStatement();
			stat.executeUpdate("create table student(id integer primary key autoincrement, name varchar(20), sex int, memo varchar(200));");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public int insertStudent(Student s){
    	int status=0;
    	try {
    		Connection conn = getConnection();
			Statement stat = conn.createStatement();
			stat.executeUpdate("insert into student(name,sex,memo) values('"+s.getName()+"',"+s.getSex()+",'"+ s.getMemo()+"');");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			status=1;
		}
		return status;
    }
    public int delStudent(int id){
    	int status=0;
    	try {
    		Connection conn = getConnection();
			Statement stat = conn.createStatement();
			stat.executeUpdate("delete from student where id='"+id+"';");
			conn.close();
		} catch (SQLException e) {
			status=1;
		}
		return status;
    }
    public List<Student> selectStudent(){
    	List<Student> list = new ArrayList<Student>();
    	try {
    		Connection conn = getConnection();
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from student;");
			while (rs.next()) { 
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setSex(rs.getInt("sex"));
				s.setMemo(rs.getString("memo"));
				list.add(s);
			}
			rs.close();
			conn.close();
		} catch (SQLException e) {

		}
    	return list;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        DemoDao dd = new DemoDao();
        //dd.initializeDB();
//        Student s = new Student("David",0,"Good" );
//        Student s1 = new Student("Mick",0,"ok" );
//        dd.insertStudent(s);
//        dd.insertStudent(s1);
//        List<Student> list = dd.selectStudent();
//        for (int i=0;i<list.size();i++){
//        	Student st = list.get(i);
//        	System.out.println(st.getName());
//        }
        
	}

}
