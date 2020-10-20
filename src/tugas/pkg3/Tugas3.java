// program penjualan laptop (terdapat diskon)
package tugas.pkg3;

//Mengimport scanner
import java.util.Scanner;


public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // buat scanner baru
            
        Scanner input = new Scanner(System.in);
        
        // cetak judul, pilihan, dll
        System.out.println("--------HARI TOKO ELEKTRONIK SEDUNIA---------");
        System.out.println("List Laptop Diskon : ");
        String[] laptop = {"1. Asus (Diskon 10%)", "2. Acer (Diskon 14%)", "3. HP (Diskon 30%)", "4. Toshiba (Diskon 26%)", "5. Lenovo (Diskon 20%)"};
        
// buat perulangan list laptop
        for(String i : laptop){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");
        
        //cetak output untuk tempat user memilih pilihan
        System.out.print("Nomor Laptop yang anda pilih : ");
        
        //memakai scanner
        int nomorlaptop = input.nextInt();
        
        // percabangan switch case (pilihan laptop)
            switch(nomorlaptop){
                
                // case pertama
                case 1 :
                    //cetak judul & harga
                    System.out.println(">>> HARGA LAPTOP <<<");
            System.out.println(">>> Harga 1 buah laptop Asus : Rp 7.000.000,- <<<");
            
            //mencetak output untuk tempat user memasukkan data
            System.out.print("Nama pembeli : ");
            //menggunakan scanner
            String nama1 = input.next();
            
            System.out.print("Total barang yang dibeli : ");
            int total1 = input.nextInt();
            
            //Operator aritmatika
            System.out.println(">>>>-- TOTAL HARGA --<<<<");
            int totalharga1 = 7000000*total1;
            int diskon1 = totalharga1/100*10;
            int totalbayar1 = 7000000-diskon1;
            System.out.println("Rp "+totalbayar1+",-");
            

            
            System.out.println("--->>>>>>>> TERIMAKASIH TELAH BERBELANJA DITEMPAT KAMI <<<<<<<<---");
break;

        // case kedua
                case 2 :
                    System.out.println(">>> HARGA LAPTOP <<<");
            System.out.println(">>> Harga 1 buah laptop Acer : Rp 6.000.000,- <<<");
            
            System.out.print("Nama pembeli : ");
            String nama2 = input.next();
            System.out.print("Total barang yang dibeli : ");
            int total2 = input.nextInt();
            
            System.out.println(">>>>-- TOTAL HARGA --<<<<");
            int totalharga2 = 6000000*total2;
            int diskon2 = totalharga2/100*14;
            int totalbayar2 = 6000000-diskon2;
            System.out.println("Rp "+totalbayar2+",-");
            
            System.out.println("--->>>>>>>> TERIMAKASIH TELAH BERBELANJA DITEMPAT KAMI <<<<<<<<---");
break;

                //case ketiga 
                case 3 :
                    System.out.println(">>> HARGA LAPTOP <<<");
            System.out.println(">>> Harga 1 buah laptop HP : Rp 9.000.000,- <<<");
            
            System.out.print("Nama pembeli : ");
            String nama3 = input.next();
            System.out.print("Total barang yang dibeli : ");
            int total3 = input.nextInt();
            
            System.out.println(">>>>-- TOTAL HARGA --<<<<");
            int totalharga3 = 9000000*total3;
            int diskon3 = totalharga3/100*30;
            int totalbayar3 = 9000000-diskon3;
            System.out.println("Rp "+totalbayar3+",-");
            
            System.out.println("--->>>>>>>> TERIMAKASIH TELAH BERBELANJA DITEMPAT KAMI <<<<<<<<---");
break;

                //case keempat
                case 4 :
                    System.out.println(">>> HARGA LAPTOP <<<");
            System.out.println(">>> Harga 1 buah laptop Toshiba : Rp 5.000.000,- <<<");
            
            System.out.print("Nama pembeli : ");
            String nama4 = input.next();
            System.out.print("Total barang yang dibeli : ");
            int total4 = input.nextInt();
            
            System.out.println(">>>>-- TOTAL HARGA --<<<<");
            int totalharga4 = 5000000*total4;
            int diskon4 = totalharga4/100*26;
            int totalbayar4 = 5000000-diskon4;
            System.out.println("Rp "+totalbayar4+",-");
            
            System.out.println("--->>>>>>>> TERIMAKASIH TELAH BERBELANJA DITEMPAT KAMI <<<<<<<<---");
break;

                //case kelima
                case 5 :
                    System.out.println(">>> HARGA LAPTOP <<<");
            System.out.println(">>> Harga 1 buah laptop Lenovo : Rp 21.000.000,- <<<");
            
            System.out.print("Nama pembeli : ");
            String nama5 = input.next();
            System.out.print("Total barang yang dibeli : ");
            int total5 = input.nextInt();
            
            System.out.println(">>>>-- TOTAL HARGA --<<<<");
            int totalharga5 = 21000000*total5;
            int diskon5 = totalharga5/100*50;
            int totalbayar5 = 21000000-diskon5;
            System.out.println("Rp "+totalbayar5+",-");
            
            System.out.println("--->>>>>>>> TERIMAKASIH TELAH BERBELANJA DITEMPAT KAMI <<<<<<<<---");
break;

                // default (jika tidak ada pilihannya)
                default :
            System.out.println("\nMaaf Mungkin barang yang anda cari tidak kami jual..");
            System.out.println("Tanya toko sebelah coba Mas/Mbak....");
        }
        
    }
}



// ALGORITMA


// 1. Mulai

// 2. Mengimpor scanner
// 3. Buat new scanner
// 4. Tampilkan judul
// 5. Tampilkan pilihan laptop pada user
// 6. Tampilkan output
// 7. Menggunakan scanner untuk variabel integer

// 8. Masukkan program percabangan switch(namavar){
// 9. Tambahkan case untuk nomor 1-5
// 10. Isi setiap case dengan kebutuhan laptop/program
// 11. Setiap case memiliki operator(untuk menghitung diskon)
// 12. Setiap case memiliki output dan scanner untuk mencetak nama dan jumlah barang
// 13. Mencetak pesan

// 14. Letakkan "break;" pada setiap akhir case
// 15. Pasang default untuk pilihan user yang tidak ada (<0 atau >5)
// 16. Cetak pesan

// 17. Selesai
    
    

