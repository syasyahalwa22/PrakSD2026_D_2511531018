package pekan8_2511531018;

public class Sorting_2511531018 {
	static Lagu_2511531018[] dataLagu_1018 = new Lagu_2511531018[7];

	static void inputData_1018() {

		dataLagu_1018[2] = new Lagu_2511531018("No One Knows", "Brent Faiyaz", 271);
		dataLagu_1018[3] = new Lagu_2511531018("You Da One", "Rihanna", 200);
		dataLagu_1018[0] = new Lagu_2511531018("Dreamin", "PARTYNEXTDOOR", 147);
		dataLagu_1018[1] = new Lagu_2511531018("bad", "wave to earth", 263);
		dataLagu_1018[4] = new Lagu_2511531018("Irreplaceable", "Beyonce", 227);
		dataLagu_1018[5] = new Lagu_2511531018("Pillowtalk", "Zayn", 202);
		dataLagu_1018[6] = new Lagu_2511531018("Animals", "Maroon 5", 231);
	}

	static void shellSort_1018() {
		int n_1018 = dataLagu_1018.length;
		for (int gap_1018 = n_1018 / 2; gap_1018 > 0; gap_1018 /= 2) {
			for (int i_1018 = gap_1018; i_1018 < n_1018; i_1018++) {
				Lagu_2511531018 temp_1018 = dataLagu_1018[i_1018];
				int j_1018 = i_1018;

				while (j_1018 >= gap_1018 &&
						dataLagu_1018[j_1018 - gap_1018]
						.judul_1018.compareToIgnoreCase(temp_1018.judul_1018) > 0) {

					dataLagu_1018[j_1018] = dataLagu_1018[j_1018 - gap_1018];
					j_1018 = j_1018 - gap_1018;
				}

				dataLagu_1018[j_1018] = temp_1018;
			}
		}
	}

	static void tampilData_1018() {

		for (int i_1018 = 0; i_1018 < dataLagu_1018.length; i_1018++) {

			System.out.println((i_1018 + 1) + ". " + dataLagu_1018[i_1018].judul_1018 + " - " + dataLagu_1018[i_1018].durasi_1018 + " detik");
		}
	}

	public static void main(String[] args) {
		inputData_1018();
		System.out.println("=== Sorting Playlist NIM : 2511531018 ===\n");

		System.out.println("Data Sebelum Sorting:");
		tampilData_1018();

		shellSort_1018();

		System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
		tampilData_1018();
	}
}

