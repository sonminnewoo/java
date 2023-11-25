package practice4;

	public class Song {
	String title;
	public Song(String title) {
		this.title = title;
	}
//	Song 함수 생성 , title 변수 생성 
	public String getTitle() {
		return title;
	}
//	메서드 선언
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Song mySong = new Song("Nessum");
		Song yourSong = new Song ("공주는 잠 못 이루고 ");
		
		System.out.println("내노래는"+mySong.getTitle());
		System.out.println("니노래는"+yourSong.getTitle());
		
	}

}
