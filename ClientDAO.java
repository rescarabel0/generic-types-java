import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class ClientDAO implements GenericDAO<Client, String> {

    LinkedHashMap<String,Client> clientList = new LinkedHashMap<String,Client>();

    @Override
    public void insert(Client object) {
        clientList.put(object.getCPF(), object);
    }

    @Override
    public Client findOne(String primaryKey) {
        return clientList.get(primaryKey);
    }

    @Override
    public List<Client> findAll() {
        List<Client> list = new ArrayList<>();
        Set<String> keys = clientList.keySet();
        for (String key : keys) {
            list.add(clientList.get(key));
        }
        return list;
    }

    @Override
    public void remove(String primaryKey) {
        clientList.remove(primaryKey);
    }

    @Override
    public int update(String primaryKey, Client newObject) {
        clientList.put(primaryKey, newObject);
        return 0;
    }
}
