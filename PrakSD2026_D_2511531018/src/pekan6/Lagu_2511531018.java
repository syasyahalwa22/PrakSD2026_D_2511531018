package pekan6;

public class Lagu_2511531018 {
	
		// atribut lagu
		String judul_1018;
		String penyanyi_1018;
		
		// pointer next dan prev
		Lagu_2511531018 next_1018;
		Lagu_2511531018 prev_1018;
		
		// konstruktor
		public Lagu_2511531018(String judul_1018, String penyanyi_1018) {
			this.judul_1018 = judul_1018;
			this.penyanyi_1018 = penyanyi_1018;
			this.next_1018 = null;
			this.prev_1018 = null;
		}
		
		// getter judul
		public String getJudul_1018() {
			return judul_1018;
		}
		
		// setter judul
		public void setJudul_1018(String judul_1018) {
			this.judul_1018 = judul_1018;
		}
		
		// getter penyanyi
		public String getPenyanyi_1018() {
			return penyanyi_1018;
		}
		
		// setter penyanyi
		public void setPenyanyi_1018(String penyanyi_1018) {
			this.penyanyi_1018 = penyanyi_1018;
		}
	}
	