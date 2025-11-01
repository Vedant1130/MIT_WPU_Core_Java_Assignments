package Assignment_8.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reservation reservation = new Reservation();

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Passenger[] passengers = new Passenger[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter passenger name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of seats to book: ");
            int seats = sc.nextInt();
            sc.nextLine(); 

            passengers[i] = new Passenger(reservation, name, seats);
        }

        // start all passenger threads
        for (int i = 0; i < n; i++) {
            passengers[i].start();
        }

        sc.close();
    }
}

class Reservation {
    int availableSeats = 5; 

    synchronized void bookTicket(String passengerName, int seatsRequested) {
        System.out.println(passengerName + " trying to book " + seatsRequested + " seat(s).");

        if (availableSeats >= seatsRequested) {
            System.out.println("Booking confirmed for " + passengerName + " (" + seatsRequested + " seat/s).");
            availableSeats -= seatsRequested;
            System.out.println("Seats left: " + availableSeats + "\n");
        } else {
            System.out.println("Sorry " + passengerName + ", not enough seats available!\n");
        }
    }
}

class Passenger extends Thread {
    Reservation reservation;
    String passengerName;
    int seatsRequested;

    Passenger(Reservation r, String name, int seats) {
        reservation = r;
        passengerName = name;
        seatsRequested = seats;
    }

    public void run() {
        reservation.bookTicket(passengerName, seatsRequested);
    }
}