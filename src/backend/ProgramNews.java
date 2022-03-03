package backend;

import entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramNews {
    //Tạo danh sách chứa đối tượng News
    List<News> newsList;
    //Tạo đối tượng scanner để nhập từ bàn phím cho nhanh
    Scanner scanner;

    //Hàm khởi tạo
    public ProgramNews() {
        newsList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //Hàm hiển thị menu
    public void displayMenu() {
        System.out.println("1 - Insert News");
        System.out.println("2 - View list news");
        System.out.println("3 - Average rates");
        System.out.println("4 - Exit");
    }

    //Hàm xử lý chính (main)
    public void mainProcess() {
        while (true) {
            //hiển thị menu
            displayMenu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    //thực hiện hàm insert 1 news vào từ bàn phím
                    insertNews();
                    break;
                case 2:
                    //thực hiện view list news
                    viewListNews();
                    break;
                case 3:
                    //thực hiện tính trung bình
                    caculateRates();
                    break;
                case 4:
                    closeInput();
                    System.out.println("Bye bye");
                    return;
            }
        }
    }

    //Hàm thêm mới news
    public void insertNews() {
        System.out.println("Mời nhập Title: ");
        scanner.nextLine();
        String titleInput = scanner.nextLine();
        System.out.println("Mời nhập Publish Date: ");
        String publishDateInput = scanner.nextLine();
        System.out.println("Mời nhập Author: ");
        String authorInput = scanner.nextLine();
        System.out.println("Mời nhập Content: ");
        String contentInput = scanner.nextLine();
        System.out.println("Mời nhập vào 3 đánh giá: ");
        System.out.println("Đánh giá thứ 1: ");
        int numb1 = scanner.nextInt();

        System.out.println("Đánh giá thứ 2: ");
        int numb2 = scanner.nextInt();

        System.out.println("Đánh giá thứ 3: ");
        int numb3 = scanner.nextInt();
        int[] inputRates = {numb1, numb2, numb3};

        News inputNews = new News(titleInput, publishDateInput, authorInput, contentInput, inputRates);
        newsList.add(inputNews);
        System.out.println("Đã thêm mới 1 News Thành công \n");
    }

    //Hàm view danh sách news
    public void viewListNews() {
        for (News n : newsList) {
            n.Display();
        }
    }

    //Hàm tính kết quả trung bình
    public void caculateRates() {
        for (News n : newsList) {
            n.Caculate();
        }
        viewListNews();
    }

    public void closeInput(){
        scanner.close();
    }
}