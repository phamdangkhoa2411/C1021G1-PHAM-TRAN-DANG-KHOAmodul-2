package bai_tap_them.bai_tap_1.controller;
   import java.util.Scanner;

   import bai_tap_them.bai_tap_1.model.Candidate;
   import bai_tap_them.bai_tap_1.service.CandidateService;
   import bai_tap_them.bai_tap_1.service.impl.CandidateServiceImpl;

public class CandidateText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CandidateService candidateService = (CandidateService) new CandidateServiceImpl();
        Candidate[] candidatesList = null;
        int select = 0;
        do {
            System.out.println("--Candidate Menu--");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("9. Exit");

            select = Integer.parseInt(input.nextLine());

            switch (select) {
                case 1:
                    candidatesList = candidateService.findAll();
                    for (Candidate candidate : candidatesList) {
                        if (candidate.getPoint15() >= 15) {
                            System.out.println(candidate);
                        }
                    }
                    break;
                case 2: //add new
                    System.out.print("Input id:");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Input name:");
                    String name = input.nextLine();
                    System.out.print("Input dateOfBirth:");
                    String dateOfBirth = input.nextLine();
                    System.out.print("Input point English:");
                    double pointEnglish = Double.parseDouble(input.nextLine());
                    System.out.print("Input point Math:");
                    double pointMath = Double.parseDouble(input.nextLine());
                    System.out.print("Input point Literature:");
                    double pointLite = Double.parseDouble(input.nextLine());
                    Candidate candidateNew = new Candidate(id, name, dateOfBirth, pointEnglish, pointMath, pointLite);
                    candidateService.add(candidateNew);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("input err!");
            }

        } while (select != 9);

    }
}
