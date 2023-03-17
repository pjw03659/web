package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PlaylistDAO {

	public PlaylistVO one(int id) {
		ResultSet rs = null;
		PlaylistVO bag = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from playlist where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (rs.next()) {
				int id2 = rs.getInt(1);
				String title = rs.getString(2);
				String artist = rs.getString(3);
				String genre = rs.getString(4);
				String alb_img = rs.getString(5);

				bag = new PlaylistVO();
				bag.setId(id2);
				bag.setTitle(title);
				bag.setArtist(artist);
				bag.setGenre(genre);
				bag.setAlb_img(alb_img);

				System.out.println(id2);
			} else {
				System.out.println("검색결과 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	public ArrayList<PlaylistVO> list() {
		ResultSet rs = null;

		ArrayList<PlaylistVO> list = new ArrayList<>();
		PlaylistVO bag = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from playlist";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			while (rs.next()) {
				int id2 = rs.getInt(1);
				String title = rs.getString(2);
				String artist = rs.getString(3);
				String genre = rs.getString(4);
				String alb_img = rs.getString(5);

				bag = new PlaylistVO();
				bag.setId(id2);
				bag.setTitle(title);
				bag.setArtist(artist);
				bag.setGenre(genre);
				bag.setAlb_img(alb_img);

				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insert(PlaylistVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql = "insert into playlist( title, artist, genre, alb_img) values ( ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getArtist());
			ps.setString(3, bag.getGenre());
			ps.setString(4, bag.getAlb_img());

			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(PlaylistVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql= "delete from playlist where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getId());
			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void update(PlaylistVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql= "update playlist set title=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle());
			ps.setInt(2, bag.getId());
			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}