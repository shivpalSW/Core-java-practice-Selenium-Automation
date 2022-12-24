package oops_Inheritance;
//Multilevel Inheritance example 
public class WatsappVersion3 extends WatsappVersion2 {

	public void videocalling() {
		System.out.println("We can make videocall");
	}

	public void stickersgif() {
		System.out.println("we can send stickers and gif");

	}

	public void status() {
		System.out.println("We can put status");

	}

	public static void main(String[] args) {
		WatsappVersion3 obj = new WatsappVersion3();
		obj.textmsg();
		obj.media();
		obj.documents();
		obj.audio();
		obj.profile();
		obj.seenmsgs();
		obj.videocalling();
		obj.stickersgif();
		obj.status();

	}

}
