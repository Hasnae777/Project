package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bonjour {

		private String bonjour="hola hasnae";

		public String getBonjour() {
			return bonjour;
		}

		public void setBonjour(String bonjour) {
			this.bonjour = bonjour;
		}
		
		
		public String getMessage(){
			return getBonjour();
		}
		
}
