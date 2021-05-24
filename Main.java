import java.time.LocalDate;
import java.util.List;

public class Main extends ClientDAO{

    public static void main(String[] args) {
        GenericDAO<Client,String> clientList = new ClientDAO();
        Client client1 = new Client("317.915.058-05", "Rafael", "+5516993199586", LocalDate.of(2001, 5, 11));
        clientList.insert(client1);
        Client client2 = new Client("248.017.108-67", "Elis", "+5516991421885", LocalDate.of(1977, 7, 11));
        clientList.insert(client2);


        System.out.println("Find All: ");
        List<Client> clientListFindAll = clientList.findAll();

        printAll(clientListFindAll);

        System.out.println("\nFind One: PK --> 317.915.058-05");
        Client findOneClient = clientList.findOne("317.915.058-05");
        printClientData(findOneClient);

        System.out.println("\nRemove: PK --> 317.915.058-05\nList after removal: ");
        clientList.remove("317.915.058-05");
        List<Client> clientListRemoved = clientList.findAll();
        printAll(clientListRemoved);

        System.out.println("\nUpdate: PK --> 248.017.108-67\nList after update: ");
        Client updateClient = new Client("248.017.108-67", "Elisangela", "+5516992972430", LocalDate.of(1977, 7, 11));
        clientList.update("248.017.108-67", updateClient);
        List<Client> clientListUpdated = clientList.findAll();
        printAll(clientListUpdated);
    }

    private static void printClientData(Client client) {
        System.out.println("Name: " + client.getName());
        System.out.println("CPF: " + client.getCPF());
        System.out.println("Phone: " + client.getPhone());
        System.out.println("Birth Date: " + client.getBirthDate());
        System.out.println("----------------------------");
    }

    private static void printAll(List<Client> clientListFindAll) {
        for (Client client : clientListFindAll){
            System.out.println("Name: " + client.getName());
            System.out.println("CPF: " + client.getCPF());
            System.out.println("Phone: " + client.getPhone());
            System.out.println("Birth Date: " + client.getBirthDate());
            System.out.println("----------------------------");
        }
    }
}
