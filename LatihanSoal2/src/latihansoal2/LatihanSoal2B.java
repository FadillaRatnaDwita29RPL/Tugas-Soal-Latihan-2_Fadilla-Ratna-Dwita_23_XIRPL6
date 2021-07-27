package latihansoal2;

public class LatihanSoal2B {

    public static void main(String[] args) {
        System.out.println("======== LATIHAN SOAL 2B ========");
        int p, q; //Inisialisasi variabel p dan q dengan tipe integer
        
        for(p=5; p>=1; p--){   //Perulangan untuk menentukan kolom segitiga, dimulai pada p=5 maka kolom pertama adalah 5
                                         //p>=1, dimana akan melakukan perulangan jika nilai p lebih besar atau sama dengan 1
                                         //dan akan berhenti ketika nilai p sudah sama dengan 1
                                         //a--, maka dalam perulangannya jika nilai p>=1 akan dilakukan pengurangan nilai p yaitu p-1
            for(q=1; q<=p; q++){ //Perulangan untuk menentukan tinggi segitiga, dimulai dari q=1
                                            //q>=p, dimana perulangan akan terjadi jika q kurang dari atau sama dengan p
                                            //akan berhenti jika nilai q sudah sama dengan p
                                            //q++, sehingga didalam perulangan jika nilai q<=p akan dilakukan penambahan nilai q yaitu q+1
                System.out.print("*"); //Mencetak "*"
            }
            System.out.println("    ");
        }
    }
    
}
