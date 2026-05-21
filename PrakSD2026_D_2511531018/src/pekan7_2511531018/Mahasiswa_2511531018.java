package pekan7_2511531018;

public class Mahasiswa_2511531018 {
	private String nama_1018;
	private String nim_1018;
    private String prodi_1018;

	// Constructor
	public Mahasiswa_2511531018(String nama_1018, String nim_1018, String prodi_1018) {
		this.nama_1018 = nama_1018;
	    this.nim_1018 = nim_1018;
	    this.prodi_1018 = prodi_1018;
	    }

	// Getter Setter
    public String getNama_1018() {
	    return nama_1018;
    }

    public void setNama_1018(String nama_1018) {
	    this.nama_1018 = nama_1018;
    }

    public String getNim_1018() {
        return nim_1018;
    }

	public void setNim_1018(String nim_1018) {
        this.nim_1018 = nim_1018;
	}

	public String getProdi_1018() {
        return prodi_1018;
	}

	public void setProdi_1018(String prodi_1018) {
        this.prodi_1018 = prodi_1018;
	}

	@Override
	public String toString() {
        return nama_1018 + " | " + nim_1018 + " | " + prodi_1018;
	 }
}
