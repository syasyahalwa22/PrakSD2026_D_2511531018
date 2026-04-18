package TugasPekan2;

public class Musik_2511531018 {
	private String judulLagu_1018;
	private String penyanyi_1018;
	private String durasi_1018;
	Musik_2511531018(String judulLagu_1018, String penyanyi_1018, String durasi_1018) {
		this.judulLagu_1018 = judulLagu_1018;
		this.penyanyi_1018 = penyanyi_1018;
		this.durasi_1018 = durasi_1018;
	}
	String getJudulLagu_1018() {
		return judulLagu_1018;
	}
	private String getPenyanyi_1018() {
		return penyanyi_1018;
	}
	private String getDurasi_1018() {
		return durasi_1018;
	}
	
	public void setJudulLagu_1018(String judulLagu_1018) {
		this.judulLagu_1018 = judulLagu_1018;
	}
	public void setPenyanyi_1018(String Penyanyi_1018) {
		this.penyanyi_1018 = penyanyi_1018;
	}
	public void durasi_1018(String durasi_1018) {
		this.durasi_1018 = durasi_1018;
	}
	@Override
	public String toString() {
		return "judulLagu: " + judulLagu_1018 + ", Penyanyi: " + penyanyi_1018 + ", Durasi: " + durasi_1018;
	}
}
