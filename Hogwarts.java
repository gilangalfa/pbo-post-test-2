package comm;

import com.mycompany.hogwarts.packagetwo.Magic;

import java.util.ArrayList;
import java.util.Scanner;

public final class Hogwarts {
    private static final ArrayList<Magic> book = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Perpustakaan - Pilih operasi:");
            System.out.println("1. Tambah Spells Baru");
            System.out.println("2. Lihat Spells yang tersedia");
            System.out.println("3. Ganti Spells");
            System.out.println("4. Hapus Spells");
            System.out.println("5. Keluar");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSpells();
                    break;
                case 2:
                    viewSpells();
                    break;
                case 3:
                    updateSpells();
                    break;
                case 4:
                    deleteSpells();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
    }

    private static void addSpells() {
        System.out.println("Spells Baru :");
        System.out.print("Nama Spells : ");
        String title = scanner.next();

        System.out.print("Founder : ");
        String author = scanner.next();

        System.out.print("Mana cost : ");
        int year = scanner.nextInt();

        Magic newBook = new Magic(book.size() + 1, title, author, year);
        book.add(newBook);

        System.out.println("Spell berhasil ditambahkan!");
    }

    private static void viewSpells() {
        System.out.println("List Spells:");
        for (Magic maho : book) {
            System.out.println("ID: " + maho.getId());
            System.out.println("Spells: " + maho.getSpells());
            System.out.println("Penemu: " + maho.getFounder());
            System.out.println("Mana cost: " + maho.getMana_cost());
            System.out.println();
        }
    }

    private static void updateSpells() {
        System.out.print("Masukkan ID Spell yang ingin diupdate: ");
        int idToUpdate = scanner.nextInt();
        Magic mahoToUpdate = findMahoById(idToUpdate);

        if (mahoToUpdate != null) {
            System.out.print("Spell baru : ");
            String newSpells = scanner.next();

            System.out.print("Penemu : ");
            String newFounder = scanner.next();

            System.out.print("Mana cost: ");
            int newMana_cost = scanner.nextInt();

            mahoToUpdate.setSpells(newSpells);
            mahoToUpdate.setFounder(newFounder);
            mahoToUpdate.setMana_cost(newMana_cost);

            System.out.println("Spell berhasil diupdate!");
        } else {
            System.out.println("Spell dengan ID " + idToUpdate + " tidak ditemukan.");
        }
    }

    private static void deleteSpells() {
        System.out.print("Masukkan ID Spell yang ingin dihapus: ");
        int idToDelete = scanner.nextInt();
        Magic mahoToDelete = findMahoById(idToDelete);

        if (mahoToDelete != null) {
            book.remove(mahoToDelete);
            System.out.println("Spell berhasil dihapus!");
        } else {
            System.out.println("Spell dengan ID " + idToDelete + " tidak ditemukan.");
        }
    }

    private static Magic findMahoById(int id) {
        for (Magic maho : book) {
            if (maho.getId() == id) {
                return maho;
            }
        }
        return null;
    }
}