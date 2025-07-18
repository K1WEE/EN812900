public class Dealer {
    public static void main(String[] args) {

        // Check arguments we need 2 arguments to process
        if (args.length < 3) {
            System.err.println("-- Invalid number of arguments --");
            System.err.println("Usage : *directory* <dealer_name> <num_clients> <dealer_gender>");
        }

        // put arguments to string in variables
        String dealer_name = args[0]; // argument index 0 is the name of the dealer
        int num_clients = Integer.parseInt(args[1]); // argument index 1 is the number of clients
        String dealer_gender = args[2]; // argument index 2 is the gender of the dealer

        // output info
        System.out.println("Dealer's name : " + dealer_name);
        System.out.println("Number of Clients : " + num_clients);
        System.out.println("Gender : " + dealer_gender);
    }

}
