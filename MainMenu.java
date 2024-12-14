import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "Administrator"; 
        String password = "";
        int pin;

        System.out.println("Silakan isi data di bawah untuk login");

        System.out.print("Masukan Nama: ");
        username = scanner.nextLine();
        System.out.print("Masukan Password: ");
        password = scanner.nextLine();
        System.out.print("Pin: ");
        pin = scanner.nextInt();

        if (username.equals("Administrator") && password.length() > 4 && pin == 123456789) {
            int mainChoice;
            do {
                System.out.println("===Silahkan Pilih Menu===");
                System.out.println("1. Bangun Ruang/Datar");
                System.out.println("2. Konversi");
                System.out.println("3. Secret Menu");
                System.out.println("4. Exit");
                System.out.print("Pilihan: ");
                mainChoice = scanner.nextInt();

                switch (mainChoice) {
                    case 1:
                        bangunRuangDatar(scanner);
                        break;
                    case 2:
                        konversi(scanner);
                        break;
                    case 3:
                        secretMenu(scanner);
                        break;
                    case 4:
                    System.out.println("Anda Keluar. Terima kasih!  Have a nice day~~~");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Coba lagi.");
                }
            } while (mainChoice != 4);
        } else {
            System.out.println("Akses ditolak! Coba lagi bro");
        }
    }

    private static void bangunRuangDatar(Scanner scanner) {
        int choice;
        do {
            System.out.println("<==Bangun Ruang/Datar==>");
            System.out.println("1. Luas (Meter Kuadrat)");
            System.out.println("2. Volume (Liter)");
            System.out.println("3. Exit");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    hitungLuas(scanner);
                    break;
                case 2:
                    hitungVolume(scanner);
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (choice != 3);
    }
    
    private static void hitungLuas(Scanner scanner) {
        System.out.println("Silahkan Pilih Menu :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Exit");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                System.out.println("Persegi Panjang");
                System.out.println("Rumus = p * l");
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                System.out.println("Luas Persegi Panjang: " + (panjang * lebar) + " m²");
                break;
            case 2:
                System.out.println("Persegi");
                System.out.println("Rumus = s * s");
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas Persegi: " + (sisi * sisi)  + " m²");
                break;
            case 3:
                System.out.println("Segitiga");
                System.out.println("Rumus = a * t ");
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi)  + " m²");
                break;
            case 4:
                System.out.println("Lingkaran");
                System.out.println("Rumus = 2.π.r.");
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * jariJari * jariJari)  + " m²");
                break;
            case 5:
                System.out.println("Kembali ke menu sebelumnya.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    
    private static void hitungVolume(Scanner scanner) {
        System.out.println("Pilihan Menu:");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Bola");
        System.out.println("4. Exit");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                System.out.println("Balok");
                System.out.println("Rumus =  p x l x t");
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                System.out.println("Volume Balok: " + (panjang * lebar * tinggi) + " L");
                break;
            case 2:
                System.out.println("Kubus");
                System.out.println("Rumus = s x s x s");
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Volume Kubus: " + (sisi * sisi * sisi) + " L");
                break;
            case 3:
                System.out.println("Bola");
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                System.out.println("Volume Bola: " + ((4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3)) + " L");
                break;
            case 4:
                System.out.println("Kembali ke menu sebelumnya.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    
    public static void konversi(Scanner scanner) {
        while (true) {
            System.out.println("Pilih Menu di bawah ini:");
            System.out.println(" 1. Derajat");
            System.out.println(" 2. Panjang (meter)");
            System.out.println(" 3. Berat (gram)");
            System.out.println(" 4. Exit");
            int choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    convertTemperature(scanner);
                    break;
                case 2:
                    convertLength(scanner);
                    break;
                case 3:
                    convertWeight(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void convertTemperature(Scanner scanner) {
        while (true) {
            System.out.println("Derajat:");
            System.out.println("Pilih soal di bawah ini:");
            System.out.println(" 1. Celcius");
            System.out.println(" 2. Farenhait");
            System.out.println(" 3. Reamur");
            System.out.println(" 4. Exit");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                    System.out.println("1. Celcius ke Farenhait");
                    System.out.println("2. Celcius ke Reamur");
                    System.out.println("3. Exit");
                    System.out.print("Masukan Pilihan");
                    int subChoice = scanner.nextInt();
                    if (subChoice == 3) 
                        break;
                    System.out.print("Masukkan nilai Celcius: ");
                    float celcius = scanner.nextFloat();
                    if (subChoice == 1) {
                        System.out.println(celcius + "°C di ubah ke " + ((celcius * 9 / 5) + 32) + "°F");
                    } else if (subChoice == 2) {
                        System.out.println(celcius + "°C di ubah ke " + (celcius * 4 / 5) + "°R");
                    }   
                    }
                    break;
                case 2:
                    while (true) {
                    System.out.println("1. Farenhait ke Celcius");
                    System.out.println("2. Farenhait ke Reamur");
                    System.out.println("3. Exit");
                    System.out.print("Masukan Pilihan");
                    int subChoice = scanner.nextInt();
                    if (subChoice == 3) 
                        break;
                    System.out.print("Masukkan nilai Farenhait: ");
                    float farenhait = scanner.nextFloat();
                    if (subChoice == 1) {
                        System.out.println(farenhait + "°F di ubah ke " + ((farenhait - 32) * 5 / 9) + "°C");
                    } else if (subChoice == 2) {
                        System.out.println(farenhait + "°F di ubah ke " + ((farenhait - 32) * 4 / 9) + "°R");
                    }
                    }
                    break;
                case 3:
                    while (true) {
                    System.out.println("1. Reamur ke Celcius");
                    System.out.println("2. Reamur ke Farenhait");
                    System.out.println("3. Exit");
                    System.out.print("Masukan Pilihan");
                    int subChoice = scanner.nextInt();
                    if (subChoice == 3) 
                        break;
                    System.out.print("Masukkan nilai Reamur: ");
                    float reamur = scanner.nextFloat();
                    if (subChoice == 1) {
                        System.out.println(reamur + "°R di ubah ke " + (reamur * 5 / 4) + "°C");
                    } else if (subChoice == 2) {
                        System.out.println(reamur + "°R di ubah ke " + ((reamur * 9 / 4) + 32) + "°F");
                    }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void convertLength(Scanner scanner) {
        while (true) {
            System.out.println("Silahkan Pilih Satuan Awal:");
            System.out.println(" 1. Kilometer");
            System.out.println(" 2. Hektometer");
            System.out.println(" 3. Dekameter");
            System.out.println(" 4. Meter");
            System.out.println(" 5. Desimeter");
            System.out.println(" 6. Sentimeter");
            System.out.println(" 7. Milimeter");
            System.out.println(" 8. Exit");
            System.out.print("Masukkan Pilihan: ");
            int fromChoice = scanner.nextInt();

            if (fromChoice == 8) {
                return;
            }

            String fromUnit = getUnitName(fromChoice);
            if (fromUnit == null) {
                System.out.println("Pilihan satuan awal tidak valid.");
                continue;
            }

            while (true) {
                System.out.printf("Silahkan Pilih Satuan Tujuan");
                System.out.printf(" 1. %s ke Kilometer\n", fromUnit);
                System.out.printf(" 2. %s ke Hektometer\n", fromUnit);
                System.out.printf(" 3. %s ke Dekameter\n", fromUnit);
                System.out.printf(" 4. %s ke Meter\n", fromUnit);
                System.out.printf(" 5. %s ke Desimeter\n", fromUnit);
                System.out.printf(" 6. %s ke Sentimeter\n", fromUnit);
                System.out.printf(" 7. %s ke Milimeter\n", fromUnit);
                System.out.println(" 8. Exit");
                System.out.print("Masukkan Pilihan: ");
                int toChoice = scanner.nextInt();

                if (toChoice == 8) {
                    break;
                }

                String toUnit = getUnitName(toChoice);
                if (toUnit == null) {
                    System.out.println("Pilihan satuan tujuan tidak valid.");
                    continue;
                }

                System.out.print("Masukkan nilai: ");
                float value = scanner.nextFloat();

                float valueInMeters = 0;

                switch (fromChoice) {
                    case 1: valueInMeters = value * 1000; break;
                    case 2: valueInMeters = value * 100; break;
                    case 3: valueInMeters = value * 10; break;
                    case 4: valueInMeters = value; break;
                    case 5: valueInMeters = value / 10; break;
                    case 6: valueInMeters = value / 100; break;
                    case 7: valueInMeters = value / 1000; break;
                    default: System.out.println("Pilihan satuan awal tidak valid."); continue;
                }

                float result = 0;

                switch (toChoice) {
                    case 1: result = valueInMeters / 1000; break;
                    case 2: result = valueInMeters / 100; break;
                    case 3: result = valueInMeters / 10; break;
                    case 4: result = valueInMeters; break;
                    case 5: result = valueInMeters * 10; break;
                    case 6: result = valueInMeters * 100; break;
                    case 7: result = valueInMeters * 1000; break;
                    default: System.out.println("Pilihan satuan tujuan tidak valid."); continue;
                }

                System.out.printf("Hasil Konversi: %.0f %s = %.2f %s\n", value, fromUnit, result, toUnit);
            }
        }
    }

    private static String getUnitName(int choice) {
        switch (choice) {
            case 1: return "Km";
            case 2: return "Hm";
            case 3: return "Dam";
            case 4: return "M";
            case 5: return "Dm";
            case 6: return "Sm";
            case 7: return "MM";
            default: return null;
        }
    }

    public static void convertWeightUnitName(Scanner scanner) {
        while (true) {
            System.out.println("Silahkan Pilih Satuan Awal:");
            System.out.println(" 1. Kilogram");
            System.out.println(" 2. Hektogram");
            System.out.println(" 3. Dekagram");
            System.out.println(" 4. Gram");
            System.out.println(" 5. Desigram");
            System.out.println(" 6. Sentigram");
            System.out.println(" 7. Miligram");
            System.out.println(" 8. Exit");
            System.out.print("Masukkan Pilihan: ");
            int fromChoice = scanner.nextInt();
    
            if (fromChoice == 8) {
                return;
            }
    
            String fromUnit = getWeightUnitName(fromChoice);
            if (fromUnit == null) {
                System.out.println("Pilihan satuan awal tidak valid.");
                continue;
            }
    
            while (true) {
                System.out.printf("Silahkan Pilih Satuan Tujuan\n");
                System.out.printf(" 1. %s ke Kilogram\n", fromUnit);
                System.out.printf(" 2. %s ke Hektogram\n", fromUnit);
                System.out.printf(" 3. %s ke Dekagram\n", fromUnit);
                System.out.printf(" 4. %s ke Gram\n", fromUnit);
                System.out.printf(" 5. %s ke Desigram\n", fromUnit);
                System.out.printf(" 6. %s ke Sentigram\n", fromUnit);
                System.out.printf(" 7. %s ke Miligram\n", fromUnit);
                System.out.println(" 8. Exit");
                System.out.print("Masukkan Pilihan: ");
                int toChoice = scanner.nextInt();
    
                if (toChoice == 8) {
                    break; // Kembali ke menu satuan awal
                }
    
                String toUnit = getWeightUnitName(toChoice);
                if (toUnit == null) {
                    System.out.println("Pilihan satuan tujuan tidak valid.");
                    continue;
                }
    
                System.out.print("Masukkan nilai: ");
                float value = scanner.nextFloat();
    
                float valueInGrams = 0;
    
                
                switch (fromChoice) {
                    case 1: valueInGrams = value * 1000; break;
                    case 2: valueInGrams = value * 100; break;
                    case 3: valueInGrams = value * 10; break;
                    case 4: valueInGrams = value; break;
                    case 5: valueInGrams = value / 10; break;
                    case 6: valueInGrams = value / 100; break;
                    case 7: valueInGrams = value / 1000; break;
                    default: System.out.println("Pilihan satuan awal tidak valid."); continue;
                }
    
                float result = 0;
    
                
                switch (toChoice) {
                    case 1: result = valueInGrams / 1000; break;
                    case 2: result = valueInGrams / 100; break;
                    case 3: result = valueInGrams / 10; break;
                    case 4: result = valueInGrams; break;
                    case 5: result = valueInGrams * 10; break;
                    case 6: result = valueInGrams * 100; break;
                    case 7: result = valueInGrams * 1000; break;
                    default: System.out.println("Pilihan satuan tujuan tidak valid."); continue;
                }
    
                System.out.printf("Hasil Konversi: %.0f %s = %.2f %s\n", value, fromUnit, result, toUnit);
            }
        }
    }
    
    public static void convertWeight(Scanner scanner) {
        while (true) {
            System.out.println("Silahkan Pilih Satuan Awal:");
            System.out.println(" 1. Kilogram");
            System.out.println(" 2. Hektogram");
            System.out.println(" 3. Dekagram");
            System.out.println(" 4. Gram");
            System.out.println(" 5. Desigram");
            System.out.println(" 6. Sentigram");
            System.out.println(" 7. Miligram");
            System.out.println(" 8. Exit");
            System.out.print("Masukkan Pilihan: ");
            int fromChoice = scanner.nextInt();
    
            if (fromChoice == 8) {
                return;
            }
    
            String fromUnit = getWeightUnitName(fromChoice);
            if (fromUnit == null) {
                System.out.println("Pilihan satuan awal tidak valid.");
                continue;
            }
    
            while (true) {
                System.out.printf("Silahkan Pilih Satuan Tujuan\n");
                System.out.printf(" 1. %s ke Kilogram\n", fromUnit);
                System.out.printf(" 2. %s ke Hektogram\n", fromUnit);
                System.out.printf(" 3. %s ke Dekagram\n", fromUnit);
                System.out.printf(" 4. %s ke Gram\n", fromUnit);
                System.out.printf(" 5. %s ke Desigram\n", fromUnit);
                System.out.printf(" 6. %s ke Sentigram\n", fromUnit);
                System.out.printf(" 7. %s ke Miligram\n", fromUnit);
                System.out.println(" 8. Exit");
                System.out.print("Masukkan Pilihan: ");
                int toChoice = scanner.nextInt();
    
                if (toChoice == 8) {
                    break;
                }
    
                String toUnit = getWeightUnitName(toChoice);
                if (toUnit == null) {
                    System.out.println("Pilihan satuan tujuan tidak valid.");
                    continue;
                }
    
                System.out.print("Masukkan nilai: ");
                float value = scanner.nextFloat();
    
                float valueInGrams = 0;
    
                
                switch (fromChoice) {
                    case 1: valueInGrams = value * 1000; break;
                    case 2: valueInGrams = value * 100; break;
                    case 3: valueInGrams = value * 10; break;
                    case 4: valueInGrams = value; break;
                    case 5: valueInGrams = value / 10; break;
                    case 6: valueInGrams = value / 100; break;
                    case 7: valueInGrams = value / 1000; break;
                    default: System.out.println("Pilihan satuan awal tidak valid."); continue;
                }
    
                float result = 0;
    
                switch (toChoice) {
                    case 1: result = valueInGrams / 1000; break;
                    case 2: result = valueInGrams / 100; break;
                    case 3: result = valueInGrams / 10; break;
                    case 4: result = valueInGrams; break;
                    case 5: result = valueInGrams * 10; break;
                    case 6: result = valueInGrams * 100; break;
                    case 7: result = valueInGrams * 1000; break;
                    default: System.out.println("Pilihan satuan tujuan tidak valid."); continue;
                }
    
                System.out.printf("Hasil Konversi: %.0f %s = %.2f %s\n", value, fromUnit, result, toUnit);
            }
        }
    }
    
    private static String getWeightUnitName(int choice) {
        switch (choice) {
            case 1: return "Kg";
            case 2: return "Hg";
            case 3: return "Dag";
            case 4: return "Gram";
            case 5: return "Dg";
            case 6: return "Sg";
            case 7: return "Mg";
            default: return null;
        }
    }
    private static void secretMenu(Scanner scanner) {
        System.out.print("Masukan kode unik: ");
        scanner.nextLine();
        String inputCode = scanner.nextLine();
    
        if (inputCode.length() < 7 || inputCode.length() > 10) {
            System.out.println("Kode unik salah! Panjang kode harus antara 7 hingga 10 karakter. Akses ditolak.");
            return;
        }

            System.out.println("Selamat Datang VIP!!");
            
            int secretChoice;
            do {
                System.out.println("Silahkan Pilih Menu Rahasia");
                System.out.println("1. Uppercase");
                System.out.println("2. Lowercase");
                System.out.println("3. Reverse");
                System.out.println("4. Exit");
                System.out.print("Pilihan: ");
                secretChoice = scanner.nextInt();
    
                scanner.nextLine();
                if (secretChoice != 4) {
                    System.out.print("Masukkan teks: ");
                    String text = scanner.nextLine();
    
                    switch (secretChoice) {
                        case 1:
                            System.out.println("Uppercase: " + text.toUpperCase());
                            break;
                        case 2:
                            System.out.println("Lowercase: " + text.toLowerCase());
                            break;
                        case 3:
                            String reversedWords = reverseWords(text);
                            System.out.println("Reverse: " + reversedWords);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                } else {
                    System.out.println("Keluar dari menu rahasia.");
                }
            } while (secretChoice != 4);
        }
    
    private static String reverseWords(String text) {
        String[] words = text.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }    
}