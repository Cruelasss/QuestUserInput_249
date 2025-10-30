Latihan Input Data Diri (Jetpack Compose)
Proyek ini adalah aplikasi Android sederhana yang dibuat dengan Jetpack Compose. Aplikasi ini mendemonstrasikan penggunaan komponen input dasar, pengelolaan state (data), dan menampilkan kembali data yang diinput oleh pengguna.

📸 Hasil Akhir
Berikut adalah tampilan aplikasi saat dijalankan, setelah pengguna memasukkan data dan menekan tombol "Submit".

<img width="1080" height="2400" alt="Screenshot_20251030_153634" src="https://github.com/user-attachments/assets/535e5395-23d9-4831-a12e-7b508e1b0982" />


🚀 Fitur & Komponen yang Digunakan
Aplikasi ini dibangun menggunakan beberapa komponen inti dari Jetpack Compose:

Column: Digunakan sebagai container utama untuk menyusun elemen secara vertikal dan mengatur perataan (alignment).

OutlinedTextField: Untuk input "Nama Lengkap" dan "Alamat Lengkap".

Row & RadioButton: Untuk menyajikan pilihan "Jenis Kelamin" (Laki-laki/Perempuan) secara horizontal.

Button: Tombol "Submit" yang akan aktif (enabled) hanya jika kolom alamat sudah terisi.

ElevatedCard: Kartu (dengan bayangan) berwarna hitam yang digunakan untuk menampilkan kembali data yang sudah di-submit.

HorizontalDivider: Garis pemisah visual untuk merapikan tata letak.

Pengelolaan State: Menggunakan remember { mutableStateOf(...) } untuk:

Menyimpan teks yang sedang diketik (textNama, textAlamat, textJK).

Menyimpan data yang sudah disubmit (nama, alamat, jenis) untuk ditampilkan di kartu.
