import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Bro","pizza" );
		logininfo.put("Tobi","samsung" );
		logininfo.put("Annika","mimi" );
		}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	
}
