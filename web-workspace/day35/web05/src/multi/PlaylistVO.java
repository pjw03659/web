package multi;

public class PlaylistVO {
	private int id;
	private String title;
	private String artist;
	private String genre;
	private String alb_img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAlb_img() {
		return alb_img;
	}
	public void setAlb_img(String alb_img) {
		this.alb_img = alb_img;
	}
	@Override
	public String toString() {
		return "PlaylistVO [id=" + id + ", title=" + title + ", artist=" + artist + ", genre=" + genre + ", alb_img="
				+ alb_img + "]";
	}
	
	
	
}
