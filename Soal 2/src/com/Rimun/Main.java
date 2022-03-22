package com.Rimun;

import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Queue todoList = new Queue();
        Scanner s = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("TODO LIST WITH QUEUE ");
            System.out.println("1. Tambahkan Todo");
            System.out.println("2. Tampllkan Todo yang harus dikerjakan Terlebih dahulu");
            System.out.println("3. Hapus TODO yang sudah selesai");
            System.out.println("4. Tampllkan Semua Todo LIST ");
            System.out.println("5. keluar");

            pilih = s.nextInt();

            if (pilih == 1){
                System.out.println("Masukan todo");
                String todo = s.next();
                todoList.insert(todo);
            }else if (pilih == 2){
                if (todoList.isQueueEmpty()){
                    System.out.println("Todo Kosong harap tambahkan Todo");
                }else{
                    System.out.println("Todolist yang harus segera diselesaikan");
                    String todoAwal = todoList.peek();
                    System.out.println("Todo pertama " + todoAwal);
                }
            }else if (pilih == 3){
                if (todoList.isQueueEmpty()){
                    System.out.println("Todo Kosong harap tambahkan Todo");
                }else{
                    todoList.delete();
                }
            }else if (pilih == 4){
                if (todoList.isQueueEmpty()){
                    System.out.println("Todo Kosong harap tambahkan Todo");
                }else{
                    todoList.display();
                }
            }
        }while (pilih < 5);
    }
}
