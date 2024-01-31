package java012_api.part02;



public class Member {//ectends Object
	int id;
	
	public Member(int id) {
		this.id = id;
	}
    
    public boolean equals(Member obj) {// 원래 object 
    	if(obj instanceof Member) {
    		return id==obj.id;
    	}else {
    		return false;
    	}
    	
//    	@override
//    	public boolean equals(Object obj) {// 원래 object 
//        	if(obj instanceof Member) {
//        		return id==((Member)obj).id;
//        	}else {
//        		return false;
//        	}
    }//end main

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}
}//end class
