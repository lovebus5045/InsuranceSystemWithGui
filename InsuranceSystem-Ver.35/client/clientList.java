package client;

public interface clientList {
	
	public boolean add(boolean waitList, client client);

	public boolean delete(boolean waitList, client client);

	public boolean modify(client client);
}